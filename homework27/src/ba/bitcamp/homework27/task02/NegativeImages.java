package ba.bitcamp.homework27.task02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NegativeImages extends JFrame {

	private BufferedImage img;
	private Panel panel = new Panel();
	private LinkedBlockingQueue<Runnable> tasks = new LinkedBlockingQueue<Runnable>();
	private ArrayList<Producer> producers = new ArrayList<Producer>();

	/**
	 * Default constructor.
	 * 
	 * @param file a file path.
	 */

	public NegativeImages(File file) {
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		setContentPane(panel);
		setTitle("Image negative");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	/**
	 * Create negative of given picture.
	 */
	public void createNegative() {

		for (int i = 0; i < getHeight(); i++) {
			tasks.add(new Consumer(i));
		}

		for (int i = 0; i < 8; i++) {
			Producer p = new Producer();
			p.start();
			producers.add(p);
		}

		for (int i = 0; i < producers.size(); i++) {
			try {
				producers.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private class Panel extends JPanel {

		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
			repaint();
		}
	}

	private class Producer extends Thread {

		@Override
		public void run() {
			while (tasks.isEmpty()) {
				try {
					tasks.take().run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private class Consumer implements Runnable {

		int numOfLine;

		public Consumer(int numOfLine) {
			this.numOfLine = numOfLine;
		}

		@Override
		public void run() {
			for (int i = 0; i < img.getWidth(); i++) {
				Color tmp = new Color(img.getRGB(i, numOfLine));
				int r = 255 - tmp.getRed();
				int g = 255 - tmp.getGreen();
				int b = 255 - tmp.getBlue();
				img.setRGB(i, numOfLine, new Color(r, g, b).getRGB());
			}
		}
	}

	public static void main(String[] args) {
		NegativeImages t = new NegativeImages(new File("/Users/ibrisimovicnarena/Desktop/more.jpg"));
		t.createNegative();
	}

}
