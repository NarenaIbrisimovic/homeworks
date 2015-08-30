package ba.bitcamp.homework28.task03;

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

public class DeleteItems {

	public static Statement statement;
	private static JButton button = new JButton("Delete");
	private static JList<String> itemList;
	private static DefaultListModel<String> listModel = new DefaultListModel<>();

	// Create constructor.
	public DeleteItems() {
		createWindow();
	}

	// Create window.
	public void createWindow() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new BorderLayout());

		button.addActionListener(new Action());

		// create the list
		itemList = new JList<>(listModel);

		panel.add(itemList, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 900);
		frame.setVisible(true);

		readListOfItem(listModel);

	}

	/**
	 * When selected item and click on button,item will be delete.
	 *
	 */
	public class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {

				String selectedRow = itemList.getSelectedValue();
				String[] selectedId = selectedRow.split(" ");
				System.out.println(selectedId[0]);

				String sqlQuery = "DELETE FROM item where id = "+ selectedId[0];
				
				try {
					statement.execute(sqlQuery);
					
				} catch (SQLException e1) {
					
					System.err.println("Bad SQL command.");
					System.err.println("Msg: " + e1.getMessage());
					System.exit(1);
				}
			}

		}

	}
	
	
	/**
	 * Method readListOfItem. Select all item from databse.
	 * @param listModel
	 */
	public static void readListOfItem(DefaultListModel<String> listModel) {

		try {
			statement = Main.conn.createStatement();

			ResultSet result = statement.executeQuery("SELECT * FROM item");

			while (result.next()) {
				listModel.addElement(result.getString(1) + " "
						+ result.getString(2) + " " + result.getString(3));
			}

		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

}
