package ba.bitcamp.homework13.task02;

public class Task2 {
	/*
	 * Get least parameter of array.
	 * @min - min parameter of array.
	 */

	public static void main(String[] args) {
		
		int min = Integer.parseInt(args [0]);
		
		for (int i = 0; i < args.length; i++){
			if (Integer.parseInt(args[i]) < min){
				min = Integer.parseInt(args[i]);
			}
			
		}
		System.out.println("Najmanji je:" + min);
		

	}

	

}
