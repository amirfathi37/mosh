import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    private static final byte PERCENT = 100;
    private static final short MONTH_IN_YEAR = 12;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal (1K - 1M) : ", 1000, 1_000_000);
        float annualRate = (float) readNumber("Annual Inerested Rate: ", 1, 10);
        byte years = (byte) readNumber("Period Year: ", 1, 30);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(calculatePayment(principal, annualRate, years)));
        printSchedule(principal, annualRate, years);
    }

    private static void printSchedule(int principal, float annualRate, byte years) {
        System.out.println();
        System.out.println("--------");
        System.out.println("Your plan is :");
        for (int m = 0; m <= years * MONTH_IN_YEAR; m++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(calculateBalance(principal, annualRate, years, m)));
        }
    }

    private static double calculatePayment(int principal, float annualRate, byte years) {
        float monthlyInterested = annualRate / PERCENT / MONTH_IN_YEAR;
        float numberOfPayment = years * MONTH_IN_YEAR;

        return principal * (monthlyInterested * Math.pow(1 + monthlyInterested, numberOfPayment))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    private static double calculateBalance(int principal, float annualRate, byte years, int numberOfPaymentMade) {
        float monthlyInterested = annualRate / PERCENT / MONTH_IN_YEAR;
        float numberOfPayment = years * MONTH_IN_YEAR;
        return principal * (Math.pow(1 + monthlyInterested, numberOfPayment) - Math.pow(1 + monthlyInterested, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    private static double readNumber(String prompt, int min, int max) {

        Scanner scanner = new Scanner(System.in);
        double value = 0;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value < min || value > max) {
                System.out.println("wrong input, it must be between " + min + " and " + max);
                continue;
            }
            break;
        }
        return value;
    }
}
