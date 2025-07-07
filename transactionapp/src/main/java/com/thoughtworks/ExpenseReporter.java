package com.thoughtworks;

import java.util.Map;
import java.util.logging.Logger;

public class ExpenseReporter {
    private static final Logger logger = Logger.getLogger(ExpenseCalculator.class.getName());

    public void printPayments(Map<String, Map<String, Integer>> payments) {
        for (String payer : payments.keySet()) {
            for (Map.Entry<String, Integer> entry : payments.get(payer).entrySet()) {
                String receiver = entry.getKey();
                int amount = entry.getValue();
                logger.info(payer + " paid ₹" + amount + " for " + receiver);
                System.out.println(payer + " paid ₹" + amount + " for " + receiver);
            }
        }
    }
}
