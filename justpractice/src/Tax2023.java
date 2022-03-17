public class Tax2023 implements TaxCalable {
    public double taxableIncome;

    public Tax2023(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double taxCalculate() {
        return taxableIncome * 2;
    }
}
