package com.belhard.branching;

import com.belhard.utils.ConsoleUtil;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Equation: \nx * x - 3 * x + 9, when x <= 3 and\n1 / (x * x * x + 6), when x > 3.");

		double x = ConsoleUtil.getDouble("x", 0);

		double result = (x <= 3) ? x * x - 3 * x + 9 : 1 / (x * x * x + 6);

		System.out.println(String.format("Equation result is %.4f", result));

	}

}
