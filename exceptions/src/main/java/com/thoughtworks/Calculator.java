package com.thoughtworks;

public class Calculator {
    public double caldouble(double num) throws ArithmeticException {
        if (num == 0) {
            throw new ArithmeticException("Zero not allowed");
        } else if (num < 0) {
            throw new ArithmeticException("negative not allowed");
        }
        return num * 2;
    }
}
