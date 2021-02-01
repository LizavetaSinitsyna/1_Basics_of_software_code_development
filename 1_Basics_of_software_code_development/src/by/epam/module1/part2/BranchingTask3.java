package by.epam.module1.part2;

import java.util.Scanner;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class BranchingTask3 {
	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		boolean result;

		x1 = readDouble("x1 >> ");
		y1 = readDouble("y1 >> ");
		x2 = readDouble("x2 >> ");
		y2 = readDouble("y2 >> ");
		x3 = readDouble("x3 >> ");
		y3 = readDouble("y3 >> ");

		/*
		 * (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1) - условие нахождения на одной
		 * прямой для 3-ёх точек. Определяется исходя из формулы площади треугольника по
		 * координатам его вершин (док-во через площади трапеций):
		 * 
		 * 1/2 * |(x2 - x1)(y3 - y1) - (x3 - x1)(y2 - y1)|.
		 * 
		 * Если 3 точки находятся на одной прямой, то площадь треугольника по формуле
		 * равна 0.
		 */

		result = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);

		System.out.println(result ? "Точки расположены на одной прямой" : "Точки не расположены на одной прямой");
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
