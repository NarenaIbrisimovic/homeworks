package ba.bitcamp.basicComponents.task06;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Task06 extends JFrame {

	private JLabel label = new JLabel();
	private JButton button = new JButton("start");
	private JTextField txt = new JTextField();
	int a;

	/**
	 * Application that counts down from input given by user.
	 */
	public Task06() {

		setLayout(new GridLayout(3, 1));

		add(label);
		add(txt);
		txt.setHorizontalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(txt.getText());
				a = Integer.parseInt(label.getText());
			}
		});

		Timer t = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (a > 0) {
					a--;
					label.setText(a + "");

				} else {
					label.setText("0");
				}

			}
		});

		t.start();
		add(button);

		setTitle("Task03");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task06();

	}

}
