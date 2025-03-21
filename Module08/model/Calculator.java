package model;

public class Calculator implements ICalculator {

    public Number add(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    public Number subtract(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }

    public Number multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    public Number divide(Number a, Number b) {
        return a.doubleValue() / b.doubleValue();
    }
}

