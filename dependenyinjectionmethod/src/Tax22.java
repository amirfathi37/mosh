public class Tax22 implements TaxCalculator {
    private double value;

    public Tax22(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value * 0.5;
    }
}
