package ba.bitcamp.homeworkW06.task02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;





public class Task02 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button1 = new JButton("Name");
	private JButton button2 = new JButton("Surname");
	private String name = getUserName();
	private String surname = getUserSurname();
	private JLabel text = new JLabel( name + " " + surname);
	
	
	
	public Task02(){
		JFrame jf  = new JFrame();
		jf.setBounds(100, 100, 400, 500);
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		
		add(button1, BorderLayout.WEST);
		button1.addActionListener(new Action());
		
		add(button2, BorderLayout.EAST);
		button2.addActionListener(new Action());
		
		text.setHorizontalAlignment(NORMAL);
		add(text, BorderLayout.CENTER);

		setVisible(true);
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1){
				name = getUserName();
			}else if (e.getSource() == button2){
				surname = getUserSurname();
			}
			text.setText(name + " " + surname );
		}
		
	}
	public static void main(String[] args) {
		new Task02();

	}
	
	/**
	 * 
	 * @return random name
	 */
	private String getUserName(){
		String name1 [] = {"Aaron","Abbott","Abel","Abner","Abraham","Adam","Addison", "Ahmed"};
		Random generator = new Random();
		int rand = generator.nextInt(name1.length - 1);
		return name1[rand];		
	}

	/**
	 * 
	 * @return random surname
	 */
	private String getUserSurname(){
		String surname1 [] = {"Gipson", "Girdler", "Girdley", "Girling", "Girman", "Girton", "Gise", "Gist", "Gitt", "Gladd", "Gladding"};
		Random generator = new Random();
		int rand = generator.nextInt(surname1.length - 1);
		return surname1[rand];			
	}
	
	
}
