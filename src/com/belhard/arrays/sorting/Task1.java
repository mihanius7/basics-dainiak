package com.belhard.arrays.sorting;

import com.belhard.utils.ArrayUtil;
import com.belhard.utils.ConsoleUtil;

public class Task1 {
	public static void main(String[] args) {
		int arrayLength = ConsoleUtil.getInt("array length", 10);
		int[] intArray = ArrayUtil.randomInteger(arrayLength, -50, 50);

		ConsoleUtil.printArray(intArray);

		ArrayUtil.burbleSort(intArray);

		ConsoleUtil.printArray(intArray);
	}
}
