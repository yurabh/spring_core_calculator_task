package com.via_java;

public class SimpleCalculator implements Simple {

    public double addMath(int a, int b) {
        return a + b;
    }

    public double subtractMath(int a, int b) {
        return a - b;
    }

    public double multiplicationMath(int a, int b) {
        return a * b;
    }

    public double divideMath(int a, int b) {
        return a / b;
    }

    public int divisionByRemainder(int a, int b) {
        return a % b;
    }
}
