package by.epam.module1.part3;

/*
 Напишите программу, где пользователь вводит любое целое положительное число.
 А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class ControlFlowTask1 {
	public static void main(String[] args) {

		long input;
		long sum;

		input = readPositiveLong("Введите любое целое положительное число: ");
		sum = 0;

		for (long i = 1; i <= input; i++) {
			sum += i;
		}
		System.out.println("Сумма всех чисел от 1 до введенного числа составляет: " + sum);
	}

	public static long readPositiveLong(String message) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		long number;

		do {
			System.out.println(message);

			while (!scan.hasNextLong()) {
				scan.nextLine();
				System.out.println(message);
			}

			number = scan.nextLong();
			scan.nextLine();
		} while (number < 0);

		return number;
	}
}
