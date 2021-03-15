package com.jpqlAndnativesql.jpqlAndnativesql.entity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class ChequeSingle extends PaymentSingle {

    @Column(name = "cardnumber")
    private String chequeNumber;

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String cardNumber) {
        this.chequeNumber = cardNumber;
    }
}
