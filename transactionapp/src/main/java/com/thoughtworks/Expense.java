package com.thoughtworks;

import java.util.List;

public class Expense {
    private final String payer;
    private final int amount;
    private final List<String> beneficiaries;


    public Expense(String payer, int amount, List<String> beneficiaries) {
        this.payer = payer;
        this.amount = amount;
        this.beneficiaries = beneficiaries;
    }

    public String getPayer() {
        return payer;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> getBeneficiaries() {
        return beneficiaries;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "payer='" + payer + '\'' +
                ", amount=" + amount +
                ", beneficiaries=" + beneficiaries +
                '}';
    }
}
