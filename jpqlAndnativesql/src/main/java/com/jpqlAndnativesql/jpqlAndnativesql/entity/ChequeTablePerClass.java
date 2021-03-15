package com.jpqlAndnativesql.jpqlAndnativesql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chequeTablePerClass")
public class ChequeTablePerClass extends PaymentTablePerClass {
    @Column(name = "chequenumber")
    private String chequeNumber;

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}