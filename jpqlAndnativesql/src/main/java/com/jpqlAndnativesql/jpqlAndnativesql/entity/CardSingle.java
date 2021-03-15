package com.jpqlAndnativesql.jpqlAndnativesql.entity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class CardSingle extends PaymentSingle {

    @Column(name = "cardnumber")
    private String cardNumber;

    public String getCard() {
        return cardNumber;
    }

    public void setCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
