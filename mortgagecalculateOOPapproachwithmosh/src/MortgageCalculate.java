public class MortgageCalculate {

    private int principal;
    private float annualRate;
    private byte years;

    public MortgageCalculate(int principal, float annualRate, byte years) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculatePayment() {
        float monthlyInterested = annualRate / StaticValues.PERCENT / StaticValues.MONTH_IN_YEAR;
        float numberOfPayment = years * StaticValues.MONTH_IN_YEAR;

        return principal * (monthlyInterested * Math.pow(1 + monthlyInterested, numberOfPayment))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    public double calculateBalance(int numberOfPaymentMade) {
        float monthlyInterested = annualRate / StaticValues.PERCENT / StaticValues.MONTH_IN_YEAR;
        float numberOfPayment = years * StaticValues.MONTH_IN_YEAR;
        return principal * (Math.pow(1 + monthlyInterested, numberOfPayment) - Math.pow(1 + monthlyInterested, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterested, numberOfPayment) - 1);
    }

    public short getYears() {
        return years;
    }
}
