package com.belhard.linear;

import com.belhard.utils.ConsoleUtil;

public class Task2 {

	public static void main(String[] args) {

		double input = ConsoleUtil.getDouble("nnn.ddd", 777.444);

		int integerPart = (int) input;
		int decimalPart = (int) Math.round((input - integerPart) * 1000);
		double reversedInput = Double.parseDouble(decimalPart + "." + integerPart);

		System.out.println("Result is " + reversedInput);

	}
}
