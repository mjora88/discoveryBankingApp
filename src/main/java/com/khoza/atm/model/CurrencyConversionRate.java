package com.khoza.atm.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Currency_conversion_Rate")
public class CurrencyConversionRate {

  @Id
  @Column
  private String currencyCode;

  @Column
  private String conversionIndicator;

  @Column
  private String rateDecimal;


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public String getConversionIndicator() {
    return conversionIndicator;
  }

  public void setConversionIndicator(String conversionIndicator) {
    this.conversionIndicator = conversionIndicator;
  }

  public String getRateDecimal() {
    return rateDecimal;
  }

  public void setRateDecimal(String rateDecimal) {
    this.rateDecimal = rateDecimal;
  }
}