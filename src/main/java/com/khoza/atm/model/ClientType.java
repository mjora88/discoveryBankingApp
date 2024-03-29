
package com.khoza.atm.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Client_type" )
public class ClientType {

  @Id
  @Column
  private String clientTypeCode;

  @Column
  private String description;

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