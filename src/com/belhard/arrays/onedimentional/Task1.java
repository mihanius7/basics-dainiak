package com.belhard.arrays.onedimentional;

import com.belhard.utils.ArrayUtil;
import com.belhard.utils.ConsoleUtil;
import com.belhard.utils.MathUtil;

public class Task1 {

	public static void main(String[] args) {

		int arrayLength = ConsoleUtil.getPositiveInt("Array length", 10);
		int divisor = ConsoleUtil.getPositiveInt("divisor", 2);

		int[] intArray = new int[arrayLength];
		ArrayUtil.fillWithRandom(intArray, 0, 500);
		ConsoleUtil.printArray(intArray);

		int summ = MathUtil.summOfArrayElements(intArray, divisor);

		System.out.println("Summ of " + divisor + "-multiplies numbers is " + summ);

	}

}
