package com.via_annotation_autowire;

import org.springframework.stereotype.Component;

@Component("simpleCalculator")
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
