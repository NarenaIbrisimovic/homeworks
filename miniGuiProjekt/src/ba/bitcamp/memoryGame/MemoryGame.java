package ba.bitcamp.memoryGame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MemoryGame extends JFrame {

	/**
	 * points score of player
	 */
	private Integer points = 0;

	/**
	 * Cretaes two JPanels
	 */
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();

	/**
	 * player1
	 */
	private JLabel player1 = new JLabel("Score Player1: " + points);

	/**
	 * arrays of buttons
	 */
	private JButton[] buttons = new JButton[16];

	/**
	 * tmp, a, b temporary variables
	 */
	JButton tmp;

	String a, b;

	/**
	 * numbers is array of number. In array numbers, same numbers can display only two times.
	 */
	int[] numbers = new int[16];
	int[] arr = new int[8];

	public MemoryGame() {

		setLayout(new GridLayout(1, 2));
		add(panel1);
		add(panel2);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		setLayout(new GridLayout(1, 2));
		add(panel1);
		add(panel2);

		panel1.setBorder(BorderFactory.createTitledBorder("Players"));
		panel2.setBorder(BorderFactory.createTitledBorder("Choose cards"));

		/**
		 * check if there are two same numbers
		 */
		Random rand = new Random();
		int x;

		for (int i = 0; i < numbers.length; i++) {
			do {
				x = rand.nextInt(8);
			} while (arr[x] == 2);
			numbers[i] = x;
			arr[x]++;
		}

		panel2.setLayout(new GridLayout(4, 4));

		/**
		 * Creates buttons
		 */
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			panel2.add(buttons[i]);
			buttons[i].addActionListener(new cusomActionListener());

			panel1.setLayout(new GridLayout());
			panel1.add(player1, BorderLayout.CENTER);

		}

		/**
		 * set sefault close, set size JFrame, set location and set visible.
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	/**
	 * If two numbers are same, player win one point and buttons are disable, vice versa.
	 *
	 */
	class cusomActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					buttons[i].setText(Integer.toString(numbers[i]));
					if (tmp == null) {
						tmp = buttons[i];
					} else {
						a = tmp.getText();
						for (int j = 0; j < buttons.length; j++) {
							if (e.getSource() == buttons[j]) {
								b = buttons[j].getText();
								if (a.equals(b)) {
									tmp.setEnabled(false);
									buttons[j].setEnabled(false);
									tmp = null;
									points++;

									player1.setText("Score Player1: "
											+ points.toString());
								} else {
									buttons[j].setText(Integer
											.toString(numbers[j]));

									tmp.setEnabled(true);
									tmp.setText("");
									buttons[j].setText("");
									tmp = null;
									points--;

									player1.setText("Score Player1: "
											+ points.toString());
								}
							}

						}

					}

				}

			}
		}

	}

	public static void main(String[] args) {
		new MemoryGame();

	}

}
