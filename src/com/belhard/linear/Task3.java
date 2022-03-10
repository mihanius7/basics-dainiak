package com.belhard.linear;

import com.belhard.utils.ConsoleUtil;
import com.belhard.utils.MathUtil;

public class Task3 {

	public static void main(String[] args) {
		int inputSeconds = ConsoleUtil.getPositiveInt("time in seconds", 128);

		System.out.println("It is " + MathUtil.timeFormat(inputSeconds));
	}

}
