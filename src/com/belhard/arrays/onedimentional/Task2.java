package com.belhard.arrays.onedimentional;

import com.belhard.utils.ArrayUtil;
import com.belhard.utils.ConsoleUtil;

public class Task2 {

	public static void main(String[] args) {
		int arrayLength = ConsoleUtil.getPositiveInt("Array length", 10);

		int positiveCount = 0, negativeCount = 0, zerosCount = 0;
		double[] arrayOfDouble = new double[arrayLength];
		arrayOfDouble = ArrayUtil.fillWithRandom(arrayOfDouble, -5, 5);
		ConsoleUtil.printArray(arrayOfDouble);
		
		for (int i = 0; i < arrayOfDouble.length; i++) {			
			if (arrayOfDouble[i] > 0)
				positiveCount++;
			else if (arrayOfDouble[i] < 0)
				negativeCount++;
			else
				zerosCount++;
		}
		
		System.out.println("\nArray statistics:\nPositive numbers count\t" + positiveCount + "\nNegative numbers count\t" + negativeCount
				+ "\nZeros count\t\t" + zerosCount);
	}

}
