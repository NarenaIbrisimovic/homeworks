package ba.bitcamp.homework10.task6;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int lengthArr = in.nextInt();
		int arr [] = new int [lengthArr];
		boolean var = true;
		
		System.out.println("Input array elements:");
		
		for (int i = 0; i < lengthArr; i++){
			arr [i] = in.nextInt();
		}
		
		System.out.println("Input Q");
		
		int Q = in.nextInt();
		
		for (int i = 0; i < lengthArr; i++ ){
			if(arr[i] == Q){
				var = true;
			}
		}
		
		System.out.println("Is number Q:" + Q + "is array:" + var);

	}

}
