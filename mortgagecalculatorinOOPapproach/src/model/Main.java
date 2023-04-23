package model;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var loan = new Loan(scanner.nextInt(), scanner.nextFloat(), scanner.nextByte());
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(loan.calculatePayment()));
        loan.printSchedule();
    }

}
