public class Main {
    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal (1K - 1M) : ", 1000, 1_000_000);
        float annualRate = (float) Console.readNumber("Annual Inerested Rate: ", 1, 10);
        byte years = (byte) Console.readNumber("Period Year: ", 1, 30);

        MortgageCalculate calculate = new MortgageCalculate(principal , annualRate , years);
        Print print = new Print(calculate);
        print.printMortgage();
        print.printSchedule();
    }

}
