package ba.bitcamp.homework28.task01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Window2 {

	public static Statement statement;
	private static JButton button = new JButton("Refresh list");
	private static JList<String> complaintList;
	private static DefaultListModel<String> listModel = new DefaultListModel<>();

	// Create window.

	public Window2() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new BorderLayout());

		button.addActionListener(new Action());
		readListOfComplaints(listModel);

		// create the list
		complaintList = new JList<>(listModel);

		panel.add(complaintList, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 900);
		frame.setVisible(true);

	}


	public class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				listModel.clear();
				readListOfComplaints(listModel);

			}

		}

	}

	/**
	 * Method readListOfComplaints, get list of data from databse.
	 * 
	 * @param listModel
	 */
	public static void readListOfComplaints(DefaultListModel<String> listModel) {

		try {
			statement = Main.conn.createStatement();

			ResultSet result = statement
					.executeQuery("SELECT * FROM complaint");

			while (result.next()) {
				listModel.addElement(result.getString(2) + " "
						+ result.getString(4) + " " + result.getString(3));
			}

		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

}
