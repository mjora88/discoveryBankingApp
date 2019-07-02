package com.khoza.atm.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Denomination_type")
public class DenominationType
{
  @Id
  private String denominationTypeCode;

  @Column
  private String description;


  public String getDenominationTypeCode()
  {
    return denominationTypeCode;
  }

  public void setDenominationTypeCode(String denominationTypeCode)
  {
    this.denominationTypeCode = denominationTypeCode;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }
}