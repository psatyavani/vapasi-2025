package com.thoughtworks;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class ExpenseParser {
    private static final Logger logger = Logger.getLogger(ExpenseParser.class.getName());

    public List<Expense> parseFromFile(InputStream inputStream) {
        List<Expense> expenses = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                String payer = words[0];
                int amount = Integer.parseInt(words[2]);
                int secondFor = line.indexOf("for", line.indexOf("for") + 1);
                String peoplePart = line.substring(secondFor + 4).trim();
                String[] people = peoplePart.split(",\\s*");
                expenses.add(new Expense(payer, amount, Arrays.asList(people)));
            }
        } catch (IOException e) {
            logger.severe("Error parsing  file " + e);
        }
        logger.info("Parsing completed successfully" + expenses);
        return expenses;
    }
}
