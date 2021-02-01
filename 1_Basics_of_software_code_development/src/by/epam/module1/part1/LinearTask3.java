package by.epam.module1.part1;

import java.util.Scanner;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦))∗𝑡𝑔 𝑥𝑦
*/

public class LinearTask3 {
	public static void main(String[] args) {

		double x;
		double y;
		double z;

		x = readDouble("x >> ");
		y = readDouble("y >> ");

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

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
