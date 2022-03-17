public class Main {
    public static void main(String[] args) {
        Tax2023 tax2023 = new Tax2023(10_0000);
        Tax2022 tax2022 = new Tax2022(5_0000);
        var report = new TaxtReport(tax2023);
        report.show();
        report.setCalable(tax2022);
        report.show();
    }
}
