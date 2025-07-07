import com.thoughtworks.Expense;
import com.thoughtworks.ExpenseCalculator;
import com.thoughtworks.ExpenseParser;
import com.thoughtworks.SplitwiseTransactionApp;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpenseCalculatorTest {
    private static final Logger logger = Logger.getLogger(ExpenseParser.class.getName());

    InputStream inputStream = SplitwiseTransactionApp.class.getResourceAsStream("/transactionDetails.txt");
    ExpenseParser parser = new ExpenseParser();
    List<Expense> expenses = parser.parseFromFile(inputStream);

    @Test
    public void testCalculatorPayments() {
        ExpenseCalculator calculator = new ExpenseCalculator();

        Map<String, Map<String, Integer>> payments = calculator.calculatePayments(expenses);
        assertNotNull(payments);
        assertTrue(payments.containsKey("A"));
        assertTrue(payments.containsKey("B"));
        assertTrue(payments.containsKey("D"));

        assertEquals(25, payments.get("A").get("B"));
        assertEquals(25, payments.get("A").get("C"));
        assertEquals(25, payments.get("A").get("D"));

        assertEquals(250, payments.get("B").get("C"));
        assertEquals(250, payments.get("B").get("D"));

        assertEquals(150, payments.get("D").get("A"));
        assertEquals(150, payments.get("D").get("B"));
    }
}
