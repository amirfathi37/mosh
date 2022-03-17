public class Tax23 implements TaxCalculator {
    private double value;

    public Tax23(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value * 0.4;
    }
}
