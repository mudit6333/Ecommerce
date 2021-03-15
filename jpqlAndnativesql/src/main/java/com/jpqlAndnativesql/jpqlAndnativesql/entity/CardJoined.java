package com.jpqlAndnativesql.jpqlAndnativesql.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cardJoined")
@PrimaryKeyJoinColumn(name = "id")
public class CardJoined extends PaymentJoined {

    @Column(name = "cardnumber")
    private String cardNumber;

    public String getCreditCard() {
        return cardNumber;
    }

    public void setCreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
