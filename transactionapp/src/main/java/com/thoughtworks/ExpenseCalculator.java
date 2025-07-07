package com.thoughtworks;

import java.util.*;
import java.util.logging.Logger;

public class ExpenseCalculator {
    private static final Logger logger = Logger.getLogger(ExpenseCalculator.class.getName());

    public Map<String, Map<String, Integer>> calculatePayments(List<Expense> expenses) {
        Map<String, Map<String, Integer>> result = new HashMap<>();
        logger.info("Performing calculation of transactions inside calculatePayments function ");
        for (Expense exp : expenses) {
            String payer = exp.getPayer();
            int totalAmount = exp.getAmount();
            List<String> people = exp.getBeneficiaries();
            int share = totalAmount / people.size();

            for (String person : people) {
                if (!person.equals(payer)) {
                    result.putIfAbsent(payer, new HashMap<>());
                    Map<String, Integer> receiverMap = result.get(payer);
                    receiverMap.put(person, receiverMap.getOrDefault(person, 0) + share);
                }
            }
        }
        logger.info("Transaction details captured into HashMap result"+result);
        return result;
    }
}

