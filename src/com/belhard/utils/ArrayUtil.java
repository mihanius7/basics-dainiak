package com.belhard.utils;

public class ArrayUtil {

	public static double[] randomDouble(int arrayLength, double min, double max) {
		double[] output = new double[arrayLength];
		for (int i = 0; i < output.length; i++) {
			output[i] = MathUtil.randomReal(min, max);
		}
		return output;
	}

	public static int[] randomInteger(int arrayLength, double min, double max) {
		int[] output = new int[arrayLength];
		for (int i = 0; i < output.length; i++) {
			output[i] = MathUtil.randomInt(min, max);
		}
		return output;
	}

	public static int[][] randomInteger(int arrayRows, int arrayColumns, int min, int max) {
		int[][] output = new int[arrayRows][arrayColumns];
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[0].length; j++)
				output[i][j] = MathUtil.randomInt(min, max);
		}
		return output;
	}

	public static void burbleSort(int[] arrayForSorting) {
		System.out.println("Burble sorting...");
		int lesserElement;
		for (int j = 0; j < arrayForSorting.length - 1; j++) {
			for (int i = 0; i < arrayForSorting.length - 1 - j; i++) {
				if (arrayForSorting[i] > arrayForSorting[i + 1]) {
					lesserElement = arrayForSorting[i + 1];
					arrayForSorting[i + 1] = arrayForSorting[i];
					arrayForSorting[i] = lesserElement;
				}
			}
		}
	}
}