package by.epam.module1.part1;

import java.util.Scanner;

/*
Найдите значение функции: z = ( (a - 3 ) * b / 2) + c
 */

class LinearTask1 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		for (int i = 0; i < 308; i++) {
			System.out.print(0);
		}
		System.out.println();
		a = readDouble("a >> ");
		b = readDouble("b >> ");
		c = readDouble("c >> ");

		z = ((a - 3) * b / 2) + c;

		System.out.println(сheckDoubleValidation(z) ? "z = " + z : "");
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
