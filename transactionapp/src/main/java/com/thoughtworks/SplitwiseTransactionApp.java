package com.thoughtworks;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SplitwiseTransactionApp {

    private static final Logger logger = Logger.getLogger(SplitwiseTransactionApp.class.getName());

    public static void main(String[] args) {
        try {

            InputStream inputStream = SplitwiseTransactionApp.class.getResourceAsStream("/transactionDetails.txt");
            if (inputStream != null) {
                logger.info("Reading file: transactionDetails.txt ");
                ExpenseParser parser = new ExpenseParser();
                List<Expense> expenses = parser.parseFromFile(inputStream);

                ExpenseCalculator calculator = new ExpenseCalculator();
                Map<String, Map<String, Integer>> payments = calculator.calculatePayments(expenses);

                ExpenseReporter reporter = new ExpenseReporter();
                reporter.printPayments(payments);

            } else {
                logger.info("Resource not found:transactionDetails.txt");
            }
        } catch (Exception e) {
            logger.severe("Error parsing file: " + e.getMessage());
        }
    }
}


