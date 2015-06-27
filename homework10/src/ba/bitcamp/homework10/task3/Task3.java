package ba.bitcamp.homework10.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int arr1[] = new int[5];
		Scanner in = new Scanner(System.in);
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				for (int k = 2; k < arr.length; k++) {

					for (int n = arr.length - 2; n >= 0; n--) {

						if (arr[n + 1] < arr[n]) {
							temp = arr[n];
							arr[n] = arr[n + 1];
							arr[n + 1] = temp;
						
						}
					}

				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
