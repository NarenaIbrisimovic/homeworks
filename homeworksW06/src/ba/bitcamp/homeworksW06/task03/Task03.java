package ba.bitcamp.homeworksW06.task03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.Arrays;

public class Task03 extends JFrame {

	private JButton[] buttons1 = new JButton[10];
	private int [] finalArray = {};
	

	public Task03() {
		
		JFrame jf = new JFrame();
		jf.setBounds(100, 50, 500, 500);
		GridLayout layout = new GridLayout();
		jf.setLayout(new GridLayout(2, 5));
		jf.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		Action[] listener = new Action[10];

		/**
		 * Create buttons
		 */
		for (int i = 0; i < 10; i++) {
			buttons1[i] = new JButton(Integer.toString(i));
			jf.add(buttons1[i]);
			listener[i] = new Action();
			buttons1[i].addActionListener(listener[i]);
		}

		jf.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i <= 4; i++) {
				if (e.getSource() == buttons1[i]) {
					buttons1[i].setEnabled(false);
					buttons1[i + 5].setEnabled(false);
					finalArray =  Arrays.copyOf(finalArray, finalArray.length + 1);
					finalArray[finalArray.length-1] = i;
				}else if (e.getSource() == buttons1[i + 5]){
					buttons1[i].setEnabled(false);
					buttons1[i+5].setEnabled(false);
					finalArray =  Arrays.copyOf(finalArray, finalArray.length + 1);
					finalArray[finalArray.length-1] = i + 5;
				}
				
			}
			if (finalArray.length == 5){
				JOptionPane.showMessageDialog(null, Arrays.toString(finalArray), "Five numbers are:", JOptionPane.PLAIN_MESSAGE );
				System.exit(0);
			}
			
		}

	}

	public static void main(String[] args) {
		new Task03();

	}

}
