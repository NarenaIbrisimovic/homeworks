package ba.bitcamp.homeworkW06.task01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Task01 extends JFrame {

	private JButton[] buttons = new JButton[10];
	private String s = "";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Task01() {

		/**
		 * Create JFrame and Action
		 */
		JFrame jf = new JFrame();
		jf.setBounds(100, 50, 500, 500);
		jf.setLayout(new GridLayout(10, 1));
		Action[] listener = new Action[10];

		/**
		 * Create array of buttons
		 */
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			jf.add(buttons[i]);
			listener[i] = new Action();
			buttons[i].addActionListener(listener[i]);
		}

		jf.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	
	public class Action implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			for (int i = 0; i < 10; i++) {
				if (e.getSource() == buttons[i]) {
					s += Integer.toString(i);
				buttons[i].setEnabled(false);
				}
			}
			if(s.length() == 3){
				JOptionPane.showMessageDialog(null, "Three numbers are: " +  s, "Upisana 3 broja", JOptionPane.PLAIN_MESSAGE );
				System.exit(0);
				}
			}


		
	}

	public static void main(String[] args) {
		new Task01();

	}

}
