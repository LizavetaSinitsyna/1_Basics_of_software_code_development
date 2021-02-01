package by.epam.module1.part3;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class ControlFlowTask6 {
	public static void main(String[] args) {

		char ch;
		
		for (int i = 0; i < 128; i++) {
			ch = (char) i;
			System.out.println("Символ: " + ch + " Число: " + i);
		}

	}
}
