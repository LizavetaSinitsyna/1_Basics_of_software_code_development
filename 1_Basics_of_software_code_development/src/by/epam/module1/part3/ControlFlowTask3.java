package by.epam.module1.part3;

/*
Найти сумму квадратов первых ста чисел.
 */

public class ControlFlowTask3 {
	public static void main(String[] args) {
		int sum;

		sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		
		System.out.println("Сумма квадратов первых ста натуральных чисел равна " + sum);
	}
}
