package com.khoza.atm.model;


import javax.persistence.*;

@Entity
@Table(name = "CLIENT_ACCOUNT")
public class ClientAccount
{
  @Id
  @Column(name = "CLIENT_ACCOUNT_NUMBER")
  private String accountNumber;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "CLIENT_ID", nullable = false, referencedColumnName = "CLIENT_ID")
  private Client client;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ACCOUNT_TYPE_CODE", nullable = false, referencedColumnName = "ACCOUNT_TYPE_CODE")
  private AccountType accountTypeCode;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "CURRENCY_CODE", nullable = false, referencedColumnName = "CURRENCY_CODE")
  private Currency currencyCode;

  @Column(name = "DISPLAY_BALANCE")
  private double balance;

  public String getAccountNumber()
  {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber)
  {
    this.accountNumber = accountNumber;
  }

  public Client getClient()
  {
    return client;
  }

  public void setClient(Client client)
  {
    this.client = client;
  }

  public Currency getCurrencyCode()
  {
    return currencyCode;
  }

  public void setCurrencyCode(Currency currencyCode)
  {
    this.currencyCode = currencyCode;
  }

  public AccountType getAccountTypeCode()
  {
    return accountTypeCode;
  }

  public void setAccountTypeCode(AccountType accountTypeCode)
  {
    this.accountTypeCode = accountTypeCode;
  }

  public Currency getCurrency()
  {
    return currencyCode;
  }

  public void setCurrency(Currency currency)
  {
    this.currencyCode = currency;
  }

  public double getBalance()
  {
    return balance;
  }

  public void setBalance(double balance)
  {
    this.balance = balance;
  }
}