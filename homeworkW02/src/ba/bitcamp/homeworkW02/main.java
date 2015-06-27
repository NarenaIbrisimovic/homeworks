package ba.bitcamp.homeworkW02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String firstNumber = "";
		String secondNumber = "";
		int a;

		a = s.indexOf("+");
		if (a == -1) {
			a = s.indexOf("-");
		}
		if (a == -1) {
			a = s.indexOf("*");
		}
		if (a == -1) {
			a = s.indexOf("/");
		}
		
		
		try{
			
		firstNumber = s.substring(0, a);
		secondNumber = s.substring(a + 1);
		
		//firstNumber = firstNumber.trim();
		//secondNumber = secondNumber.trim();
		
		int num1 = Integer.parseInt(firstNumber.trim());
		int num2 = Integer.parseInt(secondNumber.trim());

		
		
		if (s.indexOf("+") > 0) {
			System.out.println(num1 + num2);
		} else if (s.indexOf("-") > 0) {
			System.out.println(num1 - num2);
		}else if (s.indexOf("*") > 0){
			System.out.println (num1 * num2);
		}else if (s.indexOf("/") > 0){
			System.out.println (num1 / num2);
		}
		}
		catch(Exception e){
					System.out.println("Wrong input!");
				}

		
	}
		
}