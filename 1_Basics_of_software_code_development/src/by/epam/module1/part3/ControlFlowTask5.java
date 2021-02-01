package by.epam.module1.part3;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
 */

import java.util.Scanner;

public class ControlFlowTask5 {
	public static void main(String[] args) {

		double e;
		int n;
		double a;
		double sum;

		e = readDouble("Введите малое число е >> ");
		n = 0;
		a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n); // 2.0
		sum = 0;

		while (Math.abs(a) >= e) {
			n++;
			sum += a;
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			// System.out.println(a);
		}

		System.out.println("Сумма членов числового ряда, модуль которых больше или равен " + e + " составляет " + sum);

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
