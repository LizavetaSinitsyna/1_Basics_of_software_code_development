package by.epam.module1.part2;

import java.util.Scanner;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
и если да, то будет ли он прямоугольным.
 */

public class BranchingTask1 {
	public static void main(String[] args) {

		int x;
		int y;
		int z;

		x = readPositiveInt("Enter the first angle (nonnegative integer) >> ");
		y = readPositiveInt("Enter the second angle (nonnegative integer) >> ");
		z = 180 - x - y;
		if (z > 0) {
			if (x == 90 || y == 90 || z == 90) {
				System.out.println("Triangle exists. It is rectangular.");
			} else {
				System.out.println("Triangle exists. It isn't rectangular.");
			}
		} else {
			System.out.println("Triangle doesn't exist.");
		}
	}

	public static int readPositiveInt(String message) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number;

		do {
			System.out.println(message);

			while (!scan.hasNextInt()) {
				scan.nextLine();
				System.out.println(message);
			}

			number = scan.nextInt();
		} while (number < 0);

		return number;
	}
}
