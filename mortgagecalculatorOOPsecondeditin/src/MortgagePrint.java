import java.text.NumberFormat;

public class MortgagePrint {
    private MortgageCalculator calculator;

    public MortgagePrint(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(calculator.calculatePayment()));
    }

    public void printSchedule() {
        System.out.println();
        System.out.println("--------");
        System.out.println("Your plan is :");

        for (double balance :calculator.getBalance()) {
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

    }
}
