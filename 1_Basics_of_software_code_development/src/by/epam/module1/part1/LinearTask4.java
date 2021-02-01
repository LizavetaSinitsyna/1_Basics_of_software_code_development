package by.epam.module1.part1;

import java.util.Scanner;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/

public class LinearTask4 {
	public static void main(String[] args) {

		double number;
		double integerPart;
		double fractionalPart;
		double newNumber;

		number = readDouble("Введите число вида nnn.ddd (три цифровых разряда в дробной и целой частях) >> ");
		integerPart = (number * 1000) % 1000;
		fractionalPart = (number - number % 1) / 1000;
		newNumber = integerPart + fractionalPart;

		System.out.println(newNumber);
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

		if (value > 999.999 || value < 0.001) {
			System.out.println("The value is out of range.");
			return false;
		}
		return true;
	}
}


