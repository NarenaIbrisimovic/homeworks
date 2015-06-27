package ba.bitcamp.homework10.task02;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int [] arr = {1,-5,12,0,12};
		int [] arr1 = {1,-5,12,0,12};
		boolean element = true;
		
		for (int i = 0; i < arr.length; i++){
		if(arr[i] != arr1 [i]){
			element = false;
		}
		}
		if (element == true){
			System.out.println("Arrays are identical");
		}else{
		System.out.println("Arrays not identical");
		}
	}
}
