package exceptions;

import java.util.Scanner;
import java.util.logging.Logger;

public class MyCalculationApp {

    private static final Logger logger = Logger.getLogger(MyCalculationApp.class.getName());

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("Input number:");
        int input = scanner.nextInt();
        try {
            double result = cal.caldouble(input);
            logger.info("Calculated result:" + result);
            System.out.println("Calculated result:" + result);
        } catch (ArithmeticException e) {
            logger.warning("Found Arithmetic Exception"+ e);
        } finally {
            scanner.close();
        }
    }
}
