package by.epam.module1.part3;

import java.util.Scanner;

/*
Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class ControlFlowTask2 {
	public static void main(String[] args) {

		double a;
		double b;
		double h;

		a = readDouble("a >> ");
		b = readDouble("b >> ");
		h = readDouble("h >> ");

		for (double x = a; x <= b; x += h) {
			System.out.println(x > 2 ? x : -x);
		}
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
