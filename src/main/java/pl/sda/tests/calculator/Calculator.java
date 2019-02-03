package pl.sda.tests.calculator;

import lombok.Setter;

public class Calculator {

    @Setter
    private HighValueProvider valueProvider;

    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public int getValueHigherThanHundred() {
        int value = valueProvider.getHighValue();
        value = 2 * value;
        return value;
    }

    public int substract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public int divide(int a, Integer b) throws CalculatorException {
        if (b == null) {
            throw new CalculatorException("Arg should not be null");
        }
        if (b == 0) {
            throw new CalculatorException("Arg should not be 0");
        }
        return Math.floorDiv(a, b);
    }

    public boolean isEvenValue(int value) {
        return value % 2 == 0;
    }

    public int getSquareValue(int value) {
        return Math.multiplyExact(value, value);
    }

    public double calculateBruttoValue(int i) {
        return i * 1.2;
    }
}
