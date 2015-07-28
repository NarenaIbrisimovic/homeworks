package ba.bitcam.homeworkStack.task02;

public class MainStackLink {

	public static void main(String[] args) {
		StackStringLink stack = new StackStringLink();
		long timeLink = 0;
		
		System.out.println(stack.push("Nesto"));
		System.out.println(stack.push("NEko"));
		
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			stack.push("Bit");
		}
		
		long end = System.currentTimeMillis();
		timeLink = end - start;
		System.out.printf("Time is: %.2f [s]\n", (double)(timeLink) / 1000);
		
		


	}

}
