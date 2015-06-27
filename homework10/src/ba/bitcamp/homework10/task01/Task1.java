package ba.bitcamp.homework10.task01;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int value = 0;
		
		for (int i = 0; i <arr.length; i++ ){
			arr[i] = value;
			value++;
			
			if (arr[i] == 10){
				value = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
