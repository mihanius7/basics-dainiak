package com.belhard.linear;

import com.belhard.utils.ConsoleUtil;

public class Task2 {

    public static void main(String[] args) {

        double input = ConsoleUtil.getDouble("nnn.ddd", 777.444);

        double reversedInput = getReversedInput(input);

        System.out.println("Result is " + reversedInput);

    }

    private static double getReversedInput(double input) {
        int integerPart = (int) input;
        int decimalPart = (int) Math.round((input - integerPart) * 1000);
        double reversedInput = Double.parseDouble(decimalPart + "." + integerPart);
        return reversedInput;
    }
}
