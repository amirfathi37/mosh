public class Main {
    public static void main(String[] args) {
        var reporter = new TaxReporter();

        reporter.showTaxInConsole(new Tax22(1000));
        reporter.showTaxInConsole(new Tax23(2000));
    }
}
