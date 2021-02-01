package by.epam.module1.part1;

import java.util.Scanner;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class LinearTask5 {
	public static void main(String[] args) {

		long timeInSeconds;
		long seconds;
		long hours;
		long minutes;

		timeInSeconds = readPositiveLong("Past time in seconds >> ");
		seconds = timeInSeconds % 60;
		hours = timeInSeconds / 60 / 60;
		minutes = (timeInSeconds - hours * 60 * 60) / 60;

		System.out.println(hours + "ч " + minutes + "мин " + seconds + "с.");
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
		} while (number < 0);

		return number;
	}
}
