package ba.bitcamp.homework06.tasks;

import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Number");
		int n = in.nextInt();
		int sum = 0;
		
		
		while (n > 0){
			int digit = n % 10;
			n/=10;
			sum+=digit;
		}
		System.out.println(sum);
	}

}
