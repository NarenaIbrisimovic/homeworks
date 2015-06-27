package ba.bitcamp.homework10.task4;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		char arr [] = new char[] {'B', 'I','T','C','A','M','P','I','N','G'};
		System.out.print("Input number to shift: ");
		int shift = in.nextInt();
		
		
		if (shift > 0){
			char last = arr [arr.length -1];
			
			for (int i = arr.length -1; i < 0; i--){
				arr [i] = arr [i -1];
			}
			arr [0] = last;
			shift--;
		}else if (shift < 0){
			char last = arr [0];
			for (int i = 0; i< arr.length-1; i++){
				arr[i] = arr [i+1];
			}
			arr[arr.length - 1] = last;
			shift++;
			
		}
		
		System.out.println(Arrays.toString(arr));
		}
		
		
		
		

}
