package com.main;

import com.maths.*;
import com.maths.operations.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result1);

        int result2 = calculator.subtract(7, 4);
        System.out.println("7 - 4 = " + result2);

        int result3 = calculator.multiply(8, 2);
        System.out.println("8 * 2 = " + result3);

        double result4 = calculator.divide(16, 4);
        System.out.println("16 / 4 = " + result4);
    }
}