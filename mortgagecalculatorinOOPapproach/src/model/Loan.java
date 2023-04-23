package model;

import java.text.NumberFormat;

public class Loan {

    public static final String ERROR_MESSAGE = "not valid input value";
    public static final byte PERCENT = 100;
    public static final short MONTH_IN_YEAR = 12;


    private int principal;
    private float annualRate;
    private byte years;

    public Loan(int principal, float annualRate, byte years) {
       setPrincipal(principal);
       setAnnualRate(annualRate);
       setYears(years);
    }

    public void setPrincipal(int principal) {
        validateInputeValue(principal, 1000, 1_000_000);
        this.principal = principal;
    }

    public int getPrincipal() {
        return principal;
    }

    public float getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(float annualRate) {
        validateInputeValue(annualRate, 1, 10);
        this.annualRate = annualRate;
    }

    public byte getYears() {
        return years;
    }

    public void setYears(byte years) {
        validateInputeValue(years, 1, 10);
        this.years = years;
    }

    private double validateInputeValue(double value, int min, int max) {
        if (value < min || value > max)
            throw new IllegalArgumentException(ERROR_MESSAGE);
        return value;
    }

    public double calculatePayment() {
        float monthlyInterested = annualRate / PERCENT / MONTH_IN_YEAR;
        float numberOfPayment = years * MONTH_IN_YEAR;
        return principal * (monthlyInterested * Math.pow(1 + monthlyInterested, numberOfPayment))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    public double calculateBalance(int numberOfPaymentMade) {
        float monthlyInterested = annualRate / PERCENT / MONTH_IN_YEAR;
        float numberOfPayment = years * MONTH_IN_YEAR;
        return principal * (Math.pow(1 + monthlyInterested, numberOfPayment) - Math.pow(1 + monthlyInterested, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    public void printSchedule() {
        System.out.println();
        System.out.println("--------");
        System.out.println("Your plan is :");
        for (int m = 0; m <= years * MONTH_IN_YEAR; m++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(calculateBalance(m)));
        }
    }
}
