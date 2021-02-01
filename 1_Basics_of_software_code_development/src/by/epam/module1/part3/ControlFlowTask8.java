package by.epam.module1.part3;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.util.Scanner;

public class ControlFlowTask8 {
	public static void main(String[] args) {
		long firstNumber;
		long secondNumber;
		long tempNumber;
		long firstNumberDigit;
		long secondNumberDigit;
		int counter;

		firstNumber = readLong("Введите первое число: ");
		secondNumber = readLong("Введите второе число: ");

		// Change the places of numbers in accordance with their length
		if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
			tempNumber = Math.abs(firstNumber);
			firstNumber = Math.abs(secondNumber);
			secondNumber = tempNumber;
		}

		System.out.print("В запись как первого, так и второго числа входят следующие цифры: ");

		while (firstNumber != 0) {

			firstNumberDigit = firstNumber % 10;
			firstNumber /= 10;
			tempNumber = secondNumber;
			counter = 0;

			while (tempNumber != 0) {
				
				secondNumberDigit = tempNumber % 10;
				tempNumber /= 10;

				if (secondNumberDigit == firstNumberDigit && counter < 1) {
					System.out.print(firstNumberDigit + " ");
					counter++;
				}

			}
		}
	}

	public static long readLong(String message) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		long number;

		System.out.println(message);

		while (!scan.hasNextLong()) {
			scan.nextLine();
			System.out.println(message);
		}

		number = scan.nextLong();

		return number;
	}
}
