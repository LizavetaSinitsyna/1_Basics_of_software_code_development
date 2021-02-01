package by.epam.module1.part1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int[] array = new int[3];
		int[] newArray = changeArrayLength(array);
		
		System.out.print(Arrays.toString(newArray));
		
		//ArrayStoreException
		/*Object[] test = new Integer[4];
		test[0] = new String("6");*/
		
		//Creating array with 0 elements
		int[] a = new int[0];
		
		for(int i = 0; i < 308; i++) {
			System.out.print(0);
		}
		System.out.println(0);
		double value = readDouble(">>");
		
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
			scan.nextLine();
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
	
	public static int[] changeArrayLength(int[] array) {

		array = new int[]{1, 2, 3, 4};
		
		return array;
	}

}
