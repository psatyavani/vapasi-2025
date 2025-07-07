import com.thoughtworks.Expense;
import com.thoughtworks.ExpenseParser;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpenseParserTest {
    @Test
    public void testFormatOfExpenseParser() {

        InputStream inputStream = ExpenseParserTest.class.getResourceAsStream("/transactionDetails.txt");

        ExpenseParser expenses = new ExpenseParser();
        List<Expense> list;
        list = expenses.parseFromFile(inputStream);
        assertEquals(3, list.size());
        Expense exp1 = list.getFirst();
        assertEquals("A", exp1.getPayer());
        assertEquals(100, exp1.getAmount());
        assertEquals(Arrays.asList("A", "B", "C", "D"), exp1.getBeneficiaries());

        Expense exp2 = list.get(1);
        assertEquals("B", exp2.getPayer());
        assertEquals(500, exp2.getAmount());
        assertEquals(Arrays.asList("C", "D"), exp2.getBeneficiaries());

        Expense exp3 = list.get(2);
        assertEquals("D", exp3.getPayer());
        assertEquals(300, exp3.getAmount());
        assertEquals(Arrays.asList("A", "B"), exp3.getBeneficiaries());
    }

        @Test
        public void testWithWrongFormatOfExpenseParser() {

            InputStream inputStream = ExpenseParserTest.class.getResourceAsStream("/trade.txt");

            ExpenseParser expenses = new ExpenseParser();
            List<Expense> list;
            list = expenses.parseFromFile(inputStream);
            assertEquals(3, list.size());
            Expense exp1 = list.getFirst();
            assertEquals("A", exp1.getPayer());
            assertEquals(100, exp1.getAmount());
            assertEquals(Arrays.asList("A", "B", "C", "D"), exp1.getBeneficiaries());

            Expense exp2 = list.get(1);
            assertEquals("B", exp2.getPayer());
            assertEquals(500, exp2.getAmount());
            assertEquals(Arrays.asList("C", "D"), exp2.getBeneficiaries());

            Expense exp3 = list.get(2);
            assertEquals("D", exp3.getPayer());
            assertEquals(300, exp3.getAmount());
            assertEquals(Arrays.asList("A", "B"), exp3.getBeneficiaries());
        }
    }

