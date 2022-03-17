public class Tax2022 implements TaxCalable {
    public double taxableIncome;

    public Tax2022(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double taxCalculate() {
        return taxableIncome * 0.6;
    }

}
