package mvc_deisgn_pattern.model;

public class CalculatorModel {
    private int calculationValue;

    public void add(int number) {
        calculationValue += number;
    }

    public void subtract(int number) {
        calculationValue -= number;
    }

    public void multiply(int number) {
        calculationValue *= number;
    }

    public void divide(int number) {
        if (number != 0)
            calculationValue /= number;
    }

    public int getCalculationValue() {
        return calculationValue;
    }
}

