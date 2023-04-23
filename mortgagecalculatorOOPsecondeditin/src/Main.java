
public class Main {

    public static void main(String[] args) {

        int principal = (int) ConsoleModel.readNumber("Principal (1K - 1M) : ", 1000, 1_000_000);
        float annualRate = (float) ConsoleModel.readNumber("Annual Inerested Rate: ", 1, 10);
//        float annualRate = (float) ConsoleModel.readNumber("Annual Inerested Rate: ");
        byte years = (byte) ConsoleModel.readNumber("Period Year: ", 1, 30);

        MortgageCalculator calculator = new MortgageCalculator(principal, annualRate, years);

        MortgagePrint reporter = new MortgagePrint(calculator);
        reporter.printMortgage();
        reporter.printSchedule();
    }

}
