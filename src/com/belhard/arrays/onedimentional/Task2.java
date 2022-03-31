package com.belhard.arrays.onedimentional;

import com.belhard.utils.ArrayUtil;
import com.belhard.utils.ConsoleUtil;

public class Task2 {

    public static void main(String[] args) {
        int arrayLength = ConsoleUtil.getPositiveInt("Array length", 10);

        double[] arrayOfDouble = ArrayUtil.randomDouble(arrayLength, -3.1415, 9.1);
        ConsoleUtil.printArray(arrayOfDouble);
        ArrayUtil.ArrayStatistics statistics = ArrayUtil.statistics(arrayOfDouble);

        System.out.println("\nArray statistics:" +
                "\nPositive numbers count\t" + statistics.positiveCount +
                "\nNegative numbers count\t" + statistics.negativeCount +
                "\nZeros count\t\t" + statistics.zerosCount);
    }

}
