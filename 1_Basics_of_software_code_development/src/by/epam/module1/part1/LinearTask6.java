package by.epam.module1.part1;

import java.util.Scanner;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class LinearTask6 {
	public static void main(String[] args) {

		double x;
		double y;
		boolean result;

		x = readDouble("x >> ");
		y = readDouble("y >> ");
		result = (x >= -4 && x <= 4 && y <= 0 && y >= -3) || (x >= -2 && x <= 2 && y >= 0 && y <= 4);

		System.out.println(result);
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
