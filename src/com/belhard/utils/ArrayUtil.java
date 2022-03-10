package com.belhard.utils;

public class ArrayUtil {

	public static double[] fillWithRandom(double[] array, double min, double max) {
		double[] returnArray = new double[array.length];
		for (int i = 0; i < returnArray.length; i++) {
			returnArray[i] = MathUtil.randomReal(min, max);
		}
		return returnArray;
	}

	public static int[] fillWithRandom(int[] array, double min, double max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = MathUtil.randomInt(min, max);
		}
		return array;
	}

	public static void fillWithRandom(int[][] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++)
				array[i][j] = MathUtil.randomInt(min, max);
		}
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
