public class TaxReporter {
    private TaxCalculator calculator;

    public void showTaxInConsole(TaxCalculator calculator) {
        System.out.println(calculator.calculate());
    }

}
