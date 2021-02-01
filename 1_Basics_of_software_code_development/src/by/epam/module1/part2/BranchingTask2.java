package by.epam.module1.part2;

import java.util.Scanner;

/*
Найти max{min(a, b), min(c, d)}.
 */

public class BranchingTask2 {
	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double result;

		a = readDouble("a >> ");
		b = readDouble("b >> ");
		c = readDouble("c >> ");
		d = readDouble("d >> ");

		result = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println("max{min(a, b), min(c, d)} = " + result);
	}

	public static double readDouble(String message) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double number;

		do {
			System.out.println(message);

			while (!scan.hasNextDouble()) {
				scan.nextLine();
				System.out.println(message);
			}

			number = scan.nextDouble();
		} while (!сheckDoubleValidation(number));

		return number;
	}

	public static boolean сheckDoubleValidation(double value) {

		if (value > Double.MAX_VALUE || value < -Double.MAX_VALUE) {
			System.out.println("The value is out of range for double.");
			return false;
		}
		return true;
	}
}
