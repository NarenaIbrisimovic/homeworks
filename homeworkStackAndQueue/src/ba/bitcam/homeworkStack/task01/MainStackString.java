package ba.bitcam.homeworkStack.task01;

public class MainStackString {

		public static long timeArray = 0;

		public static void main(String[] args) {

			StackStringArray stack = new StackStringArray();

			System.out.println(stack.push("Skola"));

			long start = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				stack.push("Skola");
			}
			System.out.println(stack.push("Camp"));

			long end = System.currentTimeMillis();
			timeArray = end - start;

			System.out
					.printf("Time that is needed to input elements in the array is: %.2f [s]\n",
							(double) (timeArray) / 1000);

			

		
	}

}
