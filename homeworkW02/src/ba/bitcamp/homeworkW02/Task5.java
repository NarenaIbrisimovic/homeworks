package ba.bitcamp.homeworkW02;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int c = getNextOddNumber(a);
		System.out.println("Next Odd= " + c);
	}
	
	//Method that prints the next odd number
	public static int getNextOddNumber(int num) {
		if (num % 2 == 0) {
			num = num + 1;
		} else
			num = num + 2;
		return num;
	}
	
	//Method that calculated circle area 
	public static double getAreaOfCircle(int diameter) {
		double area = (diameter / 2) * (diameter / 2) * Math.PI;
		return area;

	}
	int start = 1;
	int finish = 5;
	int n =2;
	public static boolean isInRange(int start, int finish, int n) {
		boolean numIsInRange = true;
		if (start < n  && n < finish) {
			numIsInRange = true;
		} else 
			numIsInRange = false;
		return numIsInRange;
	}
	
}
