package com.khoza.atm.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Client")
public class Client
{
  @Id
  @Column(name = "CLIENT_ID")
  private Integer id;
  @Column(name = "TITLE")
  private String tittle;
  @Column(name = "NAME")
  private String name;
  @Column (name = "SURNAME")
  private String surname;
  @Column(name = "DOB")
  private Date dateOfBirth;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "CLIENT_SUB_TYPE_CODE")
  private ClientSubType ClientSubTypeCode;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getTittle()
  {
    return tittle;
  }

  public void setTittle(String tittle)
  {
    this.tittle = tittle;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getSurname()
  {
    return surname;
  }

  public void setSurname(String surname)
  {
    this.surname = surname;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public ClientSubType getClientSubTypeCode()
  {
    return ClientSubTypeCode;
  }

  public void setClientSubTypeCode(ClientSubType clientSubTypeCode)
  {
    ClientSubTypeCode = clientSubTypeCode;
  }

  public String getFormalName()
  {
    return (this.tittle != null? this.tittle + " " : "") + this.name + " " + surname;
  }
}