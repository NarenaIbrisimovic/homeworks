package ba.bitcamp.homework26.task03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InterruptingThread extends JFrame {

	public static JLabel label = new JLabel("label");
	private static JButton button = new JButton("Interrupt");
	private static Thread t;

	/**
	 * Default constructor.
	 */
	public InterruptingThread() {
		setLayout(new FlowLayout());
		add(button);
		add(label);
		label.setHorizontalAlignment(NORMAL);
		button.addActionListener(new Action());

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		t = new Thread(new MyThread());
		t.start();

	}

	/**
	 * Action class is inner class implementing ActionListener.
	 * 
	 * @author ibrisimovicnarena
	 *
	 */
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				t.interrupt();
			}

		}

	}

	/**
	 * Every second label gets one character and thread sleep 1 second unless
	 * button pressed.
	 *
	 */
	private static class MyThread implements Runnable {

		@Override
		public void run() {

			for (char i = 65; i < 91; i++) {
				label.setText(label.getText() + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}

			}
		}

		public static void main(String[] args) {
			new InterruptingThread();

		}

	}
}
