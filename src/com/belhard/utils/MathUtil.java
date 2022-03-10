package com.belhard.utils;

public class MathUtil {
	public static double max(double a, double b) {
		return a > b ? a : b;
	}

	public static double min(double a, double b) {
		return a < b ? a : b;
	}

	public static double randomReal(double min, double max) {
		return min + Math.random() * (max - min);
	};

	public static int randomInt(double min, double max) {
		return (int) Math.round(randomReal(min, max));
	};
	
	public static int summOfArrayElements(int[] array) {
		return summOfArrayElements(array, 1);
	}
	
	public static int summOfArrayElements(int[] array, int divisor) {
		int summ = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % divisor == 0)
				summ += array[i];
		}
		return summ;
	}

	public static String timeFormat(int inputSeconds) {
		int hours = inputSeconds / 3600;
		int minutes = (inputSeconds % 3600) / 60;
		int seconds = inputSeconds % 60;
		return (hours + "h " + minutes + "min " + seconds + "s");
	}
}
