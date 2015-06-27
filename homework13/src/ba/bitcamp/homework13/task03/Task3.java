package ba.bitcamp.homework13.task03;
/*
 * Napisati metodu koja za dati String ispisuje koliko taj String u sebi im brojeva. Napisati javadoc za istu tu metodu i napisati program tako da radi preko args parametra.
 */

public class Task3 {
	/*
	 * Get count of Numbers in string
	 * @counter return number in string
	 */

	public static void main(String [] args) {
		boolean number = false;
		char a;
		String b;
		int counter = 0;
		

		for (int i = 0; i < args[0].length(); i++) {
			a = args[0].charAt(i);
			for (int j = 0; j <= 9; j++) {
				b = Integer.toString(j);	
				if (a == b.charAt(0)) {
					counter++;
				
					}
								
					}
				}

	System.out.println(counter);	
	}
	
	public static int getCountOfNumbers(String s) {
		boolean number = false;
		char a;
		String b;
		int counter = 0;
		

		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			for (int j = 0; j <= 9; j++) {
				b = Integer.toString(j);	
				if (a == b.charAt(0)) {
					counter++;
				
					}
								
					}
				}
		
		
		return  counter ;
	
	}
}

