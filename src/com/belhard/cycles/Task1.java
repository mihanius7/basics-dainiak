package com.belhard.cycles;

import com.belhard.utils.ConsoleUtil;

public class Task1 {

	public static void main(String[] args) {
		int input = ConsoleUtil.getPositiveInt("array length", 5);

		int summ = 0;
		for (int i = 1; i <= input; i++)
			summ += i;
		
		System.out.println("Summ of natural numbers from 1 to " + input + " is " + summ);

	}

}
