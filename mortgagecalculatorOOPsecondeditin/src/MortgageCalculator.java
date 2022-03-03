public class MortgageCalculator {
    private int principal;
    private float annualRate;
    private byte years;

    public MortgageCalculator(int principal, float annualRate, byte years) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculatePayment() {
        float monthlyInterested = getMonthlyOfInterested();
        float numberOfPayment = getNumberOfPayment();

        return principal * (monthlyInterested * Math.pow(1 + monthlyInterested, numberOfPayment))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    public double calculateBalance(int numberOfPaymentMade) {
        float monthlyInterested = getMonthlyOfInterested();
        int numberOfPayment = getNumberOfPayment();

        return principal * (Math.pow(1 + monthlyInterested, numberOfPayment) - Math.pow(1 + monthlyInterested, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    public double[] getBalance() {
        double[] balances = new double[getNumberOfPayment()];
        for (int m = 1; m <= balances.length; m++) {
            balances[m - 1] = calculateBalance(m);
        }
        return balances;
    }

    private float getMonthlyOfInterested() {
        return annualRate / StaticValue.PERCENT / StaticValue.MONTH_IN_YEAR;
    }

    private int getNumberOfPayment() {
        return years * StaticValue.MONTH_IN_YEAR;
    }


}
