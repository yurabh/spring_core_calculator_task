package com.via_java;

public class MathematicalCalculator implements Mathematical {

    private Geometry geometry;

    public MathematicalCalculator(Geometry geometryCalculator) {
        this.geometry = geometryCalculator;
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
