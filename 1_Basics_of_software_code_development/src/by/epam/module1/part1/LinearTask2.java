package by.epam.module1.part1;

import java.util.Scanner;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑏+√(𝑏^2+4𝑎𝑐))/2𝑎−𝑎^3𝑐+𝑏^(−2)
*/

public class LinearTask2 {
	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		a = readDouble("a >>");
		b = readDouble("b >>");
		c = readDouble("c >>");

		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

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
