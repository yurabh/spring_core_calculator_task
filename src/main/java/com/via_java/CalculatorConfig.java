package com.via_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "com.via_java")
public class CalculatorConfig {

    @Bean
    public Simple simpleCalculate() {
        return new SimpleCalculator();
    }

    @Bean
    @Scope("prototype")
    public GeometryCalculator geometryCalculate() {
        return new GeometryCalculator(simpleCalculate());
    }

    @Bean
    public Mathematical mathematicalCalculate() {
        return new MathematicalCalculator(geometryCalculate());
    }
}
