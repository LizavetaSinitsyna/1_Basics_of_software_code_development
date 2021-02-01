package by.epam.module1.part2;

import java.util.Scanner;

/*
  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class BranchingTask4 {
	public static void main(String[] args) {

		double a;
		double b;

		double x;
		double y;
		double z;

		boolean result;

		a = readPositiveDouble("Enter the size of brick side a >> ");
		b = readPositiveDouble("Enter the size of brick side b >> ");

		x = readPositiveDouble("Enter the size of the hole x >> ");
		y = readPositiveDouble("Enter the size of the hole y >> ");
		z = readPositiveDouble("Enter the size of the hole z >> ");

		result = x < a && y < b || x < b && y < a || x < a && z < b || x < b && z < a || y < a && z < b
				|| y < b && z < a;

		System.out.println(result ? "The brick can pass through the hole" : "The brick can't pass through the hole");

	}

	public static double readPositiveDouble(String message) {

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
		} while (!сheckDoubleValidation(number) || number < 0);

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
