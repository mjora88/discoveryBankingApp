
package com.khoza.atm.model;


import javax.persistence.*;

@Entity
@Table (name ="CURRENCY" )
public class Currency {

  @Id
  @Column(name = "CURRENCY_CODE")
  private String currencyCode;
  @Column(name = "DECIMAL_PLACES")
  private int decimalPlaces;
  @Column (name = "DESCRIPTION")
  private String description;

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public int getDecimalPlaces() {
    return decimalPlaces;
  }

  public void setDecimalPlaces(int decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
