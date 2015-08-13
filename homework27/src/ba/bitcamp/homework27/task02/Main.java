package ba.bitcamp.homework27.task02;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import javax.swing.JFrame;

public class Main extends JFrame {

	private MyPanel panel = new MyPanel();
	private LinkedBlockingQueue<Consumer> tasks = new LinkedBlockingQueue<>();
	private ArrayList<Producer> producers = new ArrayList<>();

	/**
	 * Default constructor.
	 */
	public Main() {

		add(panel);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		for (int i = 0; i < panel.getImage().getHeight(); i++) {
			tasks.add(new Consumer(panel.getImage().getWidth(), i));
		}

		for (int i = 0; i < 8; i++) {
			Producer p = new Producer();
			p.start();
			producers.add(p);
		}

		for (Producer p : producers) {
			try {
				p.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.exit(1);
			e.printStackTrace();
		}

		System.exit(1);

	}

	private class Producer extends Thread {

		@Override
		public void run() {

			while (!tasks.isEmpty()) {
				try {
					Consumer c = tasks.take();
					c.run();
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}

	private class Consumer implements Runnable {

		private int rows;
		private int columns;

		public Consumer(int row, int column) {
			this.rows = row;
			this.columns = column;
		}

		@Override
		public void run() {
			for (int i = 0; i < rows; i++) {
				panel.getImage().setRGB(i, columns,
						255 - panel.getImage().getRGB(i, columns));
			}
		}

	}

	public static void main(String[] args) {
		new Main();
	}

}