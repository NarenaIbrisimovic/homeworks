package ba.bitcamp.homeworkW06.task05;

public class Task05 {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return base a to the b power
	 */
	private static double getPower(int a, int b){
		if(b < 0){
			return a / (getPower(a,1-b));
		}if(b == 0){
			return 1;
		}else{
			return a * getPower(a, b-1);
		}
		
	}

	public static void main(String[] args) {
		System.out.println(getPower(2,5));
		  System.out.println(getPower(-2,4));
		  System.out.println(getPower(-2,-2));

	}

}
