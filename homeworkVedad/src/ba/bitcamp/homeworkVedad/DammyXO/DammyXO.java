package ba.bitcamp.homeworkVedad.DammyXO;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DammyXO extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton buttons[] = new JButton[9];
	int counter = 0;

	public DammyXO() {
		setLayout(new GridLayout(9, 1));
		initializeButtons();
	}
	

	public void initializeButtons() {
		for (int i = 0; i <= 8; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("");
			buttons[i].addActionListener(new buttonListener());
			add(buttons[i]);
		}
	}

	
	public void resetButtons() {
		for (int i = 0; i <= 8; i++) {
			buttons[i].setText("");
		}
	}

	private class buttonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton buttonClicked = (JButton) e.getSource();
			if (counter % 2 == 0)
				buttonClicked.setText("X");
			else
				buttonClicked.setText("O");
			counter++;
		}
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().add(new DammyXO());
		window.setBounds(200, 200, 200, 200);
		window.setVisible(true);

	}

}
