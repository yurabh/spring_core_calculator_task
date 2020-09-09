package com.via_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestViaJava {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfig.class);

        GeometryCalculator geometry = context.getBean(GeometryCalculator.class);

        System.out.println("geometry cos: " + geometry.cosGeometry(244));

        System.out.println("geometry sin: " + geometry.sinGeometry(12));

        System.out.println("geometry tan: " + geometry.tanGeometry(12));

        System.out.println("geometry divide: " + geometry.multiplySimpleCalculator(1, 2));

        System.out.println("geometry add: " + geometry.addSimpleCalculator(2, 2));

        System.out.println("geometry subtract: " + geometry.subtractSimpleCalculate(44, 22));

        System.out.println("geometry divide: " + geometry.divideSimpleCalculator(10, 2));


        System.out.println("Simple calculator for us");

        SimpleCalculator simpleCalculator = context.getBean(SimpleCalculator.class);

        System.out.println("simpleCalculate add: " + simpleCalculator.addMath(3, 3));

        System.out.println("simpleCalculator divideMath: " + simpleCalculator.divideMath(10, 2));

        System.out.println("simpleCalculator multiplicationMath: " + simpleCalculator.multiplicationMath(10, 10));

        System.out.println("simpleCalculator subtractMath: " + simpleCalculator.subtractMath(10, 3));


        System.out.println("Mathematical calculator for us");

        MathematicalCalculator mathematical = context.getBean(MathematicalCalculator.class);

        System.out.println("mathematicalCalculator abs : " + mathematical.abs(33));

        System.out.println("mathematicalCalculator sqrt: " + mathematical.sqrt(323));

        System.out.println("mathematicalCalculator pow: " + mathematical.pow(12, 3));

        System.out.println("mathematical cos geometry: " + mathematical.cosGeometryCalculate(12));

        System.out.println("mathematical sin geometry: " + mathematical.sinGeometryCalculate(33));

        System.out.println("mathematical tan geometry: " + mathematical.tanGeometryCalculate(3));
    }
}
