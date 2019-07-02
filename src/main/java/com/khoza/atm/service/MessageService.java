package com.khoza.atm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService
{

    @Autowired
    MessageSource messageSource;

   private String getMessage(String configName) {
        return messageSource.getMessage(configName, null, Locale.ENGLISH);
    }
    public String getName()
    {
        return getMessage("name");
    }

    public String getListAllAccounts()
    {
        return getMessage("list.all.accounts");
    }

    public String getChooseClients()
    {
        return getMessage("list.all.clients");
    }

    public String getListCurrencyAccounts()
    {
        return getMessage("list.currency.accounts");
    }

    public String getCashWithdrawal()
    {
        return getMessage("cash.withdrawal");
    }

    public String getReportingAccountsWithHighBalance()
    {
        return getMessage("admin.reporting.clients.accounts.highest");
    }


    public String getReportingAccountsAggregatePerClient()
    {
        return getMessage("admin.reporting.clients.accounts.aggregate");
    }

    public String getWeclomeMessage()
    {
        return getMessage("welcome");
    }

  public String getDisplayAccountsPrompt()
  {
    return getMessage("accounts.prompt.display.all");
  }

  public String getDisplayCurrencyConvertedAccountValuesPrompt()
  {
    return getMessage("accounts.prompt.display.currency");
  }

  public String getCashWithdrawalPrompt()
  {
    return getMessage("accounts.prompt.Withdrawal");
  }

  public String getFindAccountsPerClientWithHighestBalance()
  {
    return getMessage("accounts.clients.highest.balance");
  }

  public String getFindFinancialPositionPerClientWithHighestBalance()
  {
    return getMessage("accounts.clients.financial.position");
  }
}