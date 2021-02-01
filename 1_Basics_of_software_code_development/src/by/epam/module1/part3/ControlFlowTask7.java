package by.epam.module1.part3;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
import java.util.Scanner;

public class ControlFlowTask7 {
	public static void main(String[] args) {

		long m;
		long n;
		long counter;

		m = readPositiveLong("Введите натуральное число m >> ");
		n = readPositiveLong("Введите натуральное число n >> ");
		counter = 0;

		for (long i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + ", отличные от единицы и самого числа: ");
			for (long j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
					counter++;
				}
			}
			if (counter == 0) {
				System.out.print("отсутствуют, так как число простое");
			} else {
				counter = 0;
			}
			System.out.println();

		}
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
