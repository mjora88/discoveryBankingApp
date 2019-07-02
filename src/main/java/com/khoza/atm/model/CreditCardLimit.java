package com.khoza.atm.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Credit_card_limit")
public class CreditCardLimit {

    @Id
    @Column(name = "client_account_number")
    private String clientAccountNumber;

    @Column (name = "account_limit")
    private double accountLimit;


    public String getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(String clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    public double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(double accountLimit) {
        this.accountLimit = accountLimit;
    }
}
