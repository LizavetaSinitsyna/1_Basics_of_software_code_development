package by.epam.module1.part2;

import java.util.Scanner;

/*
 Вычислить значение функции:
 */

public class BranchingTask5 {
	public static void main(String[] args) {

		double x;
		double result;

		x = readDouble("x >> ");

		result = x > 3 ? 1 / (Math.pow(x, 3) + 6) : Math.pow(x, 2) - 3 * x + 9;

		System.out.println("result = " + result);
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
