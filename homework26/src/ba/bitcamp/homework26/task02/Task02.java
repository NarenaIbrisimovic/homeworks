package ba.bitcamp.homework26.task02;

import java.util.Random;

public class Task02 {

	private final static int NUMBER = 1;
	private final static int BITCAMP = 2;
	private final static int RANDOM_NUM = 3;

	/**
	 * ThreeThreads is inner class, implements Runnable intreface.
	 * 
	 */

	private static class ThreeThreads implements Runnable {

		private int choice;

		public ThreeThreads(int choice) {
			this.choice = choice;

		}

		@Override
		public void run() {
			if (choice == 1) {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (choice == 2) {
				for (int i = 1; i < 5; i++) {
					System.out.println("Bitcamp");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			} else if (choice == 3) {
				Random ran = new Random();
				for (int i = 1; i <= 5; i++) {
					System.out.println(ran.nextInt(5) + 1);
					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}

		}

	}

	public static void main(String[] args) {

		/**
		 *  Creating three threads
		 */
		Thread t1 = new Thread(new ThreeThreads(1));
		Thread t2 = new Thread(new ThreeThreads(2));
		Thread t3 = new Thread(new ThreeThreads(3));

		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
