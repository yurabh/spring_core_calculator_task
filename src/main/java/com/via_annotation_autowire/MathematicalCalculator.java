package com.via_annotation_autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MathematicalCalculator implements Mathematical {

    private Geometry geometry;

    @Autowired
    public MathematicalCalculator(@Qualifier("geometryCalculator") Geometry geometry) {
        this.geometry = geometry;
    }

    public double sqrt(double data) {
        return Math.sqrt(data);
    }

    public double abs(double data) {
        return Math.abs(data);
    }

    public double pow(double first, double second) {
        return Math.pow(first, second);
    }

    public double cosGeometryCalculate(double data) {
        return geometry.cosGeometry(data);
    }

    public double sinGeometryCalculate(double data) {
        return geometry.sinGeometry(data);
    }

    public double tanGeometryCalculate(double data) {
        return geometry.tanGeometry(data);
    }
}
