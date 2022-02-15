package com.unova;

public class Calculator {
    public static void main(String[] args) {

        CalculatorBW calculatorBW = new CalculatorBW();
        //calculatorBW.doWork(args);

        CalculatorNW calculatorNW = new CalculatorNW();
        calculatorNW.doWork(args);
    }

}
