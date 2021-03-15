package com.jpqlAndnativesql.jpqlAndnativesql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cardTablePerClass")
public class CardTablePerClass extends PaymentTablePerClass {

    @Column(name = "cardnumber")
    private String cardNumber;

    public String getCreditCard() {
        return cardNumber;
    }

    public void setCreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}