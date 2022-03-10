package com.belhard.branching;

import com.belhard.utils.ConsoleUtil;
import com.belhard.utils.MathUtil;

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("Equation 'max( min(a, b), min(c, d) )'");

		double a = ConsoleUtil.getDouble("a", 5.0);
		double b = ConsoleUtil.getDouble("b", -4.0);
		double c = ConsoleUtil.getDouble("c", 3.0);
		double d = ConsoleUtil.getDouble("d", -2.5);

		double minAB = MathUtil.min(a, b);
		double minCD = MathUtil.max(c, d);
		double result = MathUtil.max(minAB, minCD);

		System.out.println("Equation result is " + result);

	}

}
