import java.text.NumberFormat;

public class Print {

    private MortgageCalculate calculate;

    public Print(MortgageCalculate calculate) {
        this.calculate = calculate;
    }

    public  void printMortgage() {
        System.out.println("Mortgage: " +
                NumberFormat
                        .getCurrencyInstance()
                        .format(calculate.calculatePayment()));
    }

    public  void printSchedule() {
        System.out.println();
        System.out.println("--------");
        System.out.println("Your plan is :");
        for (int m = 0; m <= calculate.getYears() * StaticValues.MONTH_IN_YEAR; m++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(calculate.calculateBalance(m)));
        }
    }
}
