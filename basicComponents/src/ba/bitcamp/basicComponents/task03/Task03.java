package ba.bitcamp.basicComponents.task03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task03 extends JFrame {

	public Task03() {
		setLayout(new GridLayout(2, 2));
		JLabel username = new JLabel("Username ");
		JTextField name = new JTextField();
		JLabel password = new JLabel("Password");
		JPasswordField pass = new JPasswordField();

		add(username);
		add(name);
		add(password);
		add(pass);

		setTitle("Login");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		pass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String correctPassword = "1234";
				String correctName = "Mujo";
				String givenPassword = String.valueOf(pass.getPassword());
				String givenName = String.valueOf(name.getText());

				if (correctPassword.equals(givenPassword)
						&& correctName.equals(givenName)) {
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null,
							"Incorrect Username or password");
				}
			}
		});
	}

	public static void main(String[] args) {
		new Task03();
	}
}