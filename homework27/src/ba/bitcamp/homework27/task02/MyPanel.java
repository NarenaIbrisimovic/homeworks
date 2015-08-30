package ba.bitcamp.homework27.task02;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class MyPanel extends JPanel {
	
	private BufferedImage image;

	/**
	 * Default constructor.
	 */

	public MyPanel() {
		try {
			image = ImageIO.read(new File(
					"/Users/ibrisimovicnarena/Desktop/cuko.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Override paintComponent method used to draw image and to repaint in
	 * negative colors.
	 */

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
		repaint();
	}

	public BufferedImage getImage() {
		return image;
	}

}