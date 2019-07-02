package com.khoza.atm.service;

import com.khoza.atm.model.Client;
import com.khoza.atm.model.ClientAccount;
import com.khoza.atm.model.FinancialPositionReport;
import com.khoza.atm.repository.AccountRepository;
import com.khoza.atm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankingService
{
  @Autowired
  private ClientRepository clientRepository;

  @Autowired
  private AccountRepository accountRepository;

  private static List<Integer> nodesInDescendingOrder = new ArrayList<>();

  static
  {
    nodesInDescendingOrder.add(200);
    nodesInDescendingOrder.add(100);
    nodesInDescendingOrder.add(50);
    nodesInDescendingOrder.add(20);
    nodesInDescendingOrder.add(10);
  }

  @Transactional
  public List<String> withdraw(ClientAccount selectedAccount, long amountLeftToWithdraw)
  {
    List<String> listOfNotesToReturn = new ArrayList<>();
    double totalWithdrawn = 0;

    if (amountLeftToWithdraw <= selectedAccount.getBalance())
    {
      for (Integer note : nodesInDescendingOrder)
      {
        int numberOfNodes = 0;
        while (amountLeftToWithdraw >= note)
        {
          totalWithdrawn += note;
          amountLeftToWithdraw -= note;
          numberOfNodes++;
        }
        if (numberOfNodes > 0)
        {
          listOfNotesToReturn.add(numberOfNodes + " X R" + note);
        }
      }
      selectedAccount.setBalance(selectedAccount.getBalance() - totalWithdrawn);
      accountRepository.save(selectedAccount);

      listOfNotesToReturn.add("Total Amount Withdrawn:\t R" + String.format("%.2f", totalWithdrawn));
      listOfNotesToReturn.add("Remaining Balance:\t R" + String.format("%.2f", selectedAccount.getBalance()));
    }

    return listOfNotesToReturn;
  }

  public List<FinancialPositionReport> findAllAgregateFinancialPositions()
  {
    List<FinancialPositionReport> financialPositionReports = new ArrayList<>();

    for (Client client : clientRepository.findAll())
    {
      FinancialPositionReport report = new FinancialPositionReport();
      report.setCustmerId(client.getId());
      report.setFormalName(client.getFormalName());

      List<ClientAccount> listOfClientAccounts = accountRepository.findAllByClient(client);

      if (!listOfClientAccounts.isEmpty())
      {
        report.setLoanBalance(listOfClientAccounts
            .stream()
            .filter(account -> !account.getAccountTypeCode().getTransactional())
            .mapToDouble(ClientAccount::getBalance).sum()
        );
        report.setTransactionalBalance(listOfClientAccounts
            .stream()
            .filter(account -> account.getAccountTypeCode().getTransactional())
            .mapToDouble(ClientAccount::getBalance).sum()
        );

        report.setNetPosition(listOfClientAccounts
            .stream()
            .mapToDouble(ClientAccount::getBalance).sum()
        );

        financialPositionReports.add(report);
      }
    }

    return financialPositionReports;
  }

}
