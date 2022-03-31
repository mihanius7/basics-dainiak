package com.belhard.linear;

import com.belhard.utils.ConsoleUtil;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Equation for solving: ((a - 3) * b / 2) + c");

        double a = ConsoleUtil.getDouble("a", 0),
                b = ConsoleUtil.getDouble("b", 1),
                c = ConsoleUtil.getDouble("c", 2);
        double result = f(a, b, c);

        System.out.printf("result = %4g", result);

    }

    static double f(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
