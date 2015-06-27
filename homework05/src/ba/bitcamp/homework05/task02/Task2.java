package ba.bitcamp.homework05.task02;

public class Task2 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 7;
		
		
		do {
			n--;
			if (n % 2 != 0){
				sum = sum + n;
			}
		
		} while ( n != 0 );
		System.out.println (sum);

	}

}
