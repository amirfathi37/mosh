public class TaxtReport {
    private TaxCalable calable;

    public TaxtReport(TaxCalable calable) {
        this.calable = calable;
    }

    public void setCalable(TaxCalable calable) {
        this.calable = calable;
    }

    public void show() {
        System.out.println(calable.taxCalculate());
    }
}
