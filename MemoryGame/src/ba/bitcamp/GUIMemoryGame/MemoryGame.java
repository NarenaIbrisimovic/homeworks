package ba.bitcamp.GUIMemoryGame;



import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
	private Player first = new Player("Player1");
	private Player second = new Player("Player2");
	private Player turn = first;

	/**
	 * Creates two JPanels
	 */
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();

	/**
	 * player1 and player2
	 */
	private JLabel player1 = new JLabel(first.getName() + ": " + points);
	private JLabel player2 = new JLabel(second.getName() + ": " + points);
	private JButton button = new JButton("GUI");

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
	 * numbers is array of number. In array numbers, same numbers can display
	 * only two times.
	 */
	int[] numbers = new int[16];
	int[] arr = new int[8];

	public MemoryGame() {

		setLayout(new GridLayout(1, 2));
		add(panel1);
		add(panel2);
		panel1.add(panel3);
		panel3.add(button);
		button.addActionListener(new cusomActionListener1());

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

			panel1.setLayout(new GridLayout(3,3));
			panel1.add(player1, BorderLayout.CENTER);
			panel1.add(player2, BorderLayout.CENTER);
			
		}
	
		/**
		 * set close, set size JFrame, set location and set visible.
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	/**
	 * If two numbers are same, player win one point and buttons are disable,
	 * vice versa.
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
						tmp.setEnabled(false);
					} else {
						a = tmp.getText();
						for (int j = 0; j < buttons.length; j++) {
							if (e.getSource() == buttons[j]) {
								b = buttons[j].getText();
								if (a.equals(b)) { // Hit
									tmp.setEnabled(false);
									buttons[j].setEnabled(false);
									tmp = null;
									turn.plusPoint();

									player1.setText(first.getName() + ": "
											+ first.getPoints());
									player2.setText(second.getName() + ": "
											+ second.getPoints());

								} else { // Miss
									tmp.setEnabled(true);
									buttons[j].setText(Integer
											.toString(numbers[j]));
									// try {
									// TimeUnit.SECONDS.sleep(1);
									// } catch (InterruptedException e1) {}

									tmp.setText("");
									buttons[j].setText("");

									tmp = null;
									turn.minusPoint();

									player1.setText(first.getName() + ": "
											+ first.getPoints());
									player2.setText(second.getName() + ": "
											+ second.getPoints());

									if (turn == first) {
										turn = second;
									} else {
										turn = first;
									}
								}

							}

						}

					}

				}

			}

		}
		
		
	}

	
	class cusomActionListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop()
						.browse(new URI(
								"https://github.com/NarenaIbrisimovic/homeworks/tree/MemoryGame/MemoryGame"));
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		new MemoryGame();

	}

	public class Player {
		String playerName;
		int result = 0;

		public Player(String name) {
			this.playerName = name;
		}

		public void plusPoint() {
			this.result++;
		}

		public void minusPoint() {
			this.result--;
		}

		public String getName() {
			return this.playerName;
		}

		public int getPoints() {
			return this.result;
		}
	}
}
