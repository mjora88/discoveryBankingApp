
package com.khoza.atm.model;

public class FinancialPositionReport
{

  private long custmerId;

  private String formalName;

  private double loanBalance;
  private double transactionalBalance;
  private double netPosition;

  public long getCustmerId()
  {
    return custmerId;
  }

  public void setCustmerId(long custmerId)
  {
    this.custmerId = custmerId;
  }

  public String getFormalName()
  {
    return formalName;
  }

  public void setFormalName(String formalName)
  {
    this.formalName = formalName;
  }

  public double getNetPosition()
  {
    return netPosition;
  }

  public void setNetPosition(double netPosition)
  {
    this.netPosition = netPosition;
  }

  public double getLoanBalance()
  {
    return loanBalance;
  }

  public void setLoanBalance(double loanBalance)
  {
    this.loanBalance = loanBalance;
  }

  public double getTransactionalBalance()
  {
    return transactionalBalance;
  }

  public void setTransactionalBalance(double transactionalBalance)
  {
    this.transactionalBalance = transactionalBalance;
  }

  @Override
  public String toString()
  {
    return formalName + "\tLoan Balance: R" + String.format("%.2f", loanBalance) + "\t\tTransactional Balance: R" + String.format("%.2f", transactionalBalance) + "\t\tNet Balance: R" + String.format("%.2f", netPosition);
  }
}
