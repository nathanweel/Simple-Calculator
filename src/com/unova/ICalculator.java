package com.unova;

public interface ICalculator {
    double add(double x, double y);

    double sub(double x, double y);

    double mult(double x, double y);

    double div(double x, double y);

    double mod(double x, double y);

    double getAnswer(double x, double y, double answer, String operation);
}
