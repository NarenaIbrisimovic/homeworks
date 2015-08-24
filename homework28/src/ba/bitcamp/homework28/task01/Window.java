package ba.bitcamp.homework28.task01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Window {

	public static Statement statement;
	private static JButton button = new JButton("Save");
	private static JTextArea area = new JTextArea(20, 10);

	// Create constructor.
	public Window() {
		createWindow();
	}

	// Create window.
	public void createWindow() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new BorderLayout());

		button.addActionListener(new Action());

		panel.add(area, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

	public class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				if (!area.getText().equals("")) {
					insertComplation(area.getText());
				}
			}

		}

	}

	/**
	 * Insert data in database.
	 * @param complations
	 */
	public static void insertComplation(String complations) {
		try {
			statement = Main.conn.createStatement();

			DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			Date date = new Date();

			String insertQuery = "INSERT INTO complaint VALUES(null,'"+ dateFormat.format(date) + "','" + area.getText() + "','"
					+ timeFormat.format(date) + "')";
			statement.executeUpdate(insertQuery);
			area.setText("");

		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);

		}

	}

}
