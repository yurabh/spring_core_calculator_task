package com.via_annotation_autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GeometryCalculator implements Geometry {

    private Simple simple;

    @Autowired
    public GeometryCalculator(@Qualifier("simpleCalculator") Simple simple) {
        this.simple = simple;
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
        return simple.addMath(a, b);
    }

    public double subtractSimpleCalculate(int a, int b) {
        return simple.subtractMath(a, b);
    }

    public double divideSimpleCalculator(int a, int b) {
        return simple.divideMath(a, b);
    }

    public double multiplySimpleCalculator(int a, int b) {
        return simple.multiplicationMath(a, b);
    }
}
