package by.epam.module1.part3;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class ControlFlowTask4 {
	public static void main(String[] args) {
		long result;

		result = 1;

		for (int i = 2; i <= 200; i++) {
			if (Long.MAX_VALUE / (i * i) > result) {
				result *= i * i;
			} else {
				System.out.println("Значение произведения находится за пределами возможного значения long.\n"
						+ "Произведение квадратов первых " + (i - 1) + " натуральных чисел равно " + result + ".");
				return;
			}
		}

		System.out.println("Произведение квадратов первых двухсот натуральных чисел равно " + result);
	}
}
