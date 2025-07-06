package com.thoughtworks;

import java.util.*;

public class ExpenseCalculator {

    public Map<String, Map<String, Integer>> calculatePayments(List<Expense> expenses) {
        Map<String, Map<String, Integer>> result = new HashMap<>();

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

        return result;
    }
}

