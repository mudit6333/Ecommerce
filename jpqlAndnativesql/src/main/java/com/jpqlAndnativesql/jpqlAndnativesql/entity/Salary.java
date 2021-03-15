package com.jpqlAndnativesql.jpqlAndnativesql.entity;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Salary {

    @Column(name = "basicSalary")
    private double basicSalary;

    @Column(name = "bonusSalary")
    private double bonusSalary;

    @Column(name = "taxAmount")
    private double taxAmount;

    @Column(name = "specialAllowanceSalary")
    private double specialAllowanceSalary;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}