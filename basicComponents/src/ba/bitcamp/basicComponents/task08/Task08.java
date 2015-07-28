package ba.bitcamp.basicComponents.task08;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Task08 extends JFrame{
	
	private JTextField username = new JTextField();
	private JPasswordField password1 = new JPasswordField();
	private JPasswordField password2 = new JPasswordField();
	private JLabel label1 = new JLabel("Username: ");
	private JLabel label2 = new JLabel("Password: ");
	private JLabel label3 = new JLabel("Repeat password: ");
	private JButton clear = new JButton("clear");
	private JButton submit = new JButton("submit");

	
	public Task08(){
		
		setLayout(new GridLayout(6, 0));
		add(label1);
		add(username);
		add(label2);
		add(password1);
		add(label3);
		add(password2);
		add(clear);
		add(submit);
		
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String s1 = String.valueOf(password1.getPassword());
				String s2 = String.valueOf(password2.getPassword());
				String s = username.getText();
				
				if(s.equals("Narena") && s.length() > 6 && s1.equals("Narena0805") && s1.length() > 6
						&& s2.equals("Narena0805") && s2.length() > 6){
					System.exit(0);
				}else{
					JOptionPane.showMessageDialog(null, "Wrong username and password");
				}
			}
		});
		
		
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				username.setText("");
				password1.setText("");
				password2.setText("");
				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	

	
	
	
	
	public static void main(String[] args) {
		new Task08();

	}

}
