package com.thoughtworks;

import java.io.*;
import java.util.*;

public class SplitwiseTransactionApp {

    public static void main(String[] args) {


        try {
            InputStream inputStream = SplitwiseTransactionApp.class.getResourceAsStream("/transactionDetails.txt");

            ExpenseParser parser = new ExpenseParser();
            List<Expense> expenses = parser.parseFromFile(inputStream);

            ExpenseCalculator calculator = new ExpenseCalculator();
            Map<String, Map<String, Integer>> payments = calculator.calculatePayments(expenses);

            ExpenseReporter reporter = new ExpenseReporter();
            reporter.printPayments(payments);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


