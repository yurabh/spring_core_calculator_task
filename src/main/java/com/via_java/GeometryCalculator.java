package com.via_java;

public class GeometryCalculator implements Geometry {

    private Simple simpleCalculator;

    public GeometryCalculator(Simple simple) {
        this.simpleCalculator = simple;
    }

    public double cosGeometry(double data) {
        return Math.cos(data);
    }

    public double sinGeometry(double data) {
        return Math.sin(data);
    }

    public double tanGeometry(double data) {
        return Math.tan(data);
    }

    public double addSimpleCalculator(int a, int b) {
        return simpleCalculator.addMath(a, b);
    }

    public double subtractSimpleCalculate(int a, int b) {
        return simpleCalculator.subtractMath(a, b);
    }

    public double divideSimpleCalculator(int a, int b) {
        return simpleCalculator.divideMath(a, b);
    }

    public double multiplySimpleCalculator(int a, int b) {
        return simpleCalculator.multiplicationMath(a, b);
    }
}
