package com.belhard.cycles;

import com.belhard.utils.ConsoleUtil;

public class Task2 {

	public static void main(String[] args) {

		double a = ConsoleUtil.getDouble("a", -3.14);
		double b = ConsoleUtil.getDouble("b", 6.28);
		if (a > b) {
			System.out.println("'a' must be lesser than 'b'. Please, restart and try again.");
			return;
		}
		double h = ConsoleUtil.getDouble("h", 0.785);

		double x = a, y;
		while (x <= b) {
			y = f(x);
			System.out.printf("%.3f\t%.3f%n", x, y);
			x += h;
		}
	}

	private static double f(double x) {
		double y;
		y = (x > 2) ? x + 4 : -x * 2;
		return y;
	}

}
