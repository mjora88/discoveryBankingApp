
package com.khoza.atm.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client_Sub_Type")
public class ClientSubType {

  @Id
  @Column
  private String clientSubTypeCode;

  @Column
  private String clientTypeCode;

  @Column
  private String description;

  public String getClientSubTypeCode() {
    return clientSubTypeCode;
  }

  public void setClientSubTypeCode(String clientSubTypeCode) {
    this.clientSubTypeCode = clientSubTypeCode;
  }

  public String getClientTypeCode() {
    return clientTypeCode;
  }

  public void setClientTypeCode(String clientTypeCode) {
    this.clientTypeCode = clientTypeCode;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}