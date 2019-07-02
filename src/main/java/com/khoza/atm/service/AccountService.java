package com.khoza.atm.service;

import com.khoza.atm.model.Client;
import com.khoza.atm.model.ClientAccount;
import com.khoza.atm.repository.AccountRepository;
import com.khoza.atm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService
{
  @Autowired
  private ClientRepository clientRepository;

  @Autowired
  private AccountRepository accountRepository;

  public List<Client> getAllClients()
  {
    return (List<Client>) clientRepository.findAll();
  }

  public ClientAccount findById(String id)
  {
    return accountRepository.findOne(id);
  }

  public ClientAccount getAccountWithHighestBalance(Client client)
  {
    return findAllByClient(client).stream().max((o1, o2) -> (int) (o1.getBalance() - o2.getBalance())).orElse(null);
  }

  public List<ClientAccount> findAllByClient(Client selectedCustomer)
  {

    return ((List<ClientAccount>) accountRepository.findAll())
        .stream()
        .filter(clientAccount -> clientAccount.getClient().getId().equals(selectedCustomer.getId())).collect(Collectors.toList());
  }

  public List<ClientAccount> findAllTransactionalAccountsForClient(Client client)
  {
    return findAllByClient(client).stream().filter(clientAccount -> clientAccount.getAccountTypeCode().getTransactional()).collect(Collectors.toList());
  }
}
