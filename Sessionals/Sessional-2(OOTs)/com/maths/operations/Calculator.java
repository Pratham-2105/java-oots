package com.maths.operations;

import com.maths.*;

public class Calculator {
    public int add(int a, int b) {
        return MathOperations.add(a, b);
    }

    public int subtract(int a, int b) {
        return MathOperations.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return MathOperations.multiply(a, b);
    }

    public double divide(int a, int b) {
        return MathOperations.divide(a, b);
    }
}
