package com.thoughtworks;

import java.util.Map;

public class ExpenseReporter {

    public void printPayments(Map<String, Map<String, Integer>> payments) {
        for (String payer : payments.keySet()) {
            for (Map.Entry<String, Integer> entry : payments.get(payer).entrySet()) {
                String receiver = entry.getKey();
                int amount = entry.getValue();
                System.out.println(payer + " paid ₹" + amount + " for " + receiver);
            }
        }
    }
}
