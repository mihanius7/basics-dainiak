package com.belhard.arrays.multidimentional;

import com.belhard.utils.ArrayUtil;
import com.belhard.utils.ConsoleUtil;

public class Task1 {

	public static void main(String[] args) {
		int rowCount = 6, columnCount = 8;
		int[][] intArray = new int[rowCount][columnCount];
		ArrayUtil.fillWithRandom(intArray, -10, 10);
		ConsoleUtil.printArray(intArray);
	}

}
