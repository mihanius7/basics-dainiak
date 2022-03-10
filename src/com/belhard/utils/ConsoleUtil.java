package com.belhard.utils;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ConsoleUtil {
	
	private final static Scanner scanner = new Scanner(System.in);
	static Locale locale = new Locale("", "");
	static ResourceBundle rb = ResourceBundle.getBundle("lang/text", locale);
	
	public static int getInt(String varName, int defaultValue) {
		System.out.print(rb.getString("prompt") + " '" + varName + "' " + rb.getString("integer") + ": ");
		scanner.useLocale(Locale.getDefault());
		int input;
		if (scanner.hasNextInt()) {
			input = scanner.nextInt();
			return input;
		} else {
			System.out.println(rb.getString("wrong") + " '" + varName + "': " + defaultValue);
			scanner.next();
			return defaultValue;
		}

	}

	public static int getPositiveInt(String varName, int defaultValue) {
		int input = getInt(varName, defaultValue);
		if (input <= 0) {
			System.out.println(rb.getString("positive") + " '" + varName + "': " + defaultValue);
			return defaultValue;
		}
		return input;
	}

	public static double getDouble(String varName, double defaultValue) {
		System.out.print(rb.getString("prompt") + " '" + varName + "' " + rb.getString("real") + ": ");
		scanner.useLocale(Locale.US);
		double input;
		if (scanner.hasNextDouble()) {
			input = scanner.nextDouble();
			return input;
		} else {
			System.out.println(rb.getString("wrong") + " '" + varName + "': " + defaultValue);
			scanner.next();
			return defaultValue;
		}
	}

	public static double getPositiveDouble(String varName, double defaultValue) {
		double input = getDouble(varName, defaultValue);
		if (input <= 0) {
			System.out.println(rb.getString("positive") + " '" + varName + "': " + defaultValue);
			return defaultValue;
		}
		return input;
	}
	
	public static void printArray(int[] array) {
		System.out.println("Array content:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}	
	
	public static void printArray(double[] array) {
		System.out.println("Array content: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(String.format("%.6f", array[i]));
		}
	}
	
	public static void printArray(int[][] array) {
		System.out.println("Array content: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
