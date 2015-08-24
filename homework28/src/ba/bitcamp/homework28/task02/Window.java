package ba.bitcamp.homework28.task02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window {

	public static Statement statement;
	private static JButton button = new JButton("Save");
	private static JTextField code = new JTextField();
	private static JTextField itemName = new JTextField();
	private static JTextField price = new JTextField();
	private static JLabel codeLabel = new JLabel("Code:");
	private static JLabel itemNameLabel = new JLabel("Item:");
	private static JLabel priceLabel = new JLabel("Price:");
	public static int replay;

	// Create constructor.
	public Window() {
		createWindow();
	}

	// Create window.
	public void createWindow() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(3, 2));

		button.addActionListener(new Action());

		panel.add(codeLabel);
		panel.add(code);
		panel.add(itemNameLabel);
		panel.add(itemName);
		panel.add(priceLabel);
		panel.add(price);
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
				
				if (validCode(code.getText()) == false) {
					JOptionPane.showMessageDialog(null, "You need use only number");
					return;
				}
				if (isCodeExist(code.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Duplicate code");
					return;
				}

				if (isNameItemValid(itemName.getText()) == false) {

					 replay = JOptionPane.showConfirmDialog(null,"Are you sure you want insert item with same name?","", JOptionPane.YES_NO_OPTION);
					if (replay == JOptionPane.NO_OPTION) {
						return;

					}
					

				}
				

			}
			insertItems(code.getText(),itemName.getText(),price.getText());
			code.setText("");
			itemName.setText("");
			price.setText("");
		}

		
		/**
		 * Method validCode.If code has 10 number tehods return true,
		 * @param code enter some code
		 * @return true or false
		 */
		public boolean validCode(String code) {
			if (code.length() != 10) {
				return false;
			}
			if (!code.matches("[0-9]+")) {
				return false;
			}
			return true;

		}
		
		
		/**
		 * Check if code exist. If exist method return false
		 * @param code
		 * @return true or false.
		 */

		public boolean isCodeExist(String code) {
			try {
				statement = Main.conn.createStatement();
				String codeDatabase = "SELECT code FROM item WHERE code='"
						+ code + "'";
				ResultSet result = statement.executeQuery(codeDatabase);
				if (result.next()) {
					return false;
				}
			} catch (SQLException e) {
				System.err.println("Bad SQL command.");
				System.err.println("Msg: " + e.getMessage());
				System.exit(1);
			}

			return true;

		}
		/**
		 * Check if item name is ok.
		 * @param itemName
		 * @return true or false.
		 */
		public boolean isNameItemValid(String itemName) {

			try {
				statement = Main.conn.createStatement();
				String sqlQuery = "SELECT nameItem FROM item WHERE nameItem ='"
						+ itemName + "'";
				ResultSet result = statement.executeQuery(sqlQuery);
				if (result.next()) {
					return false;
				}
			} catch (SQLException e) {
				System.err.println("Bad SQL command.");
				System.err.println("Msg: " + e.getMessage());
				System.exit(1);
			}
			return true;
		}

		/**
		 *  Insert data in database.
		 * @param codeNumber
		 * @param item
		 * @param price
		 */
		public void insertItems(String codeNumber, String item, String price) {
			try {
				statement = Main.conn.createStatement();

				String insertQuery = "INSERT INTO item VALUES(null,'"
						+ code.getText() + "','" + itemName.getText() + "','" + price + "')";
				statement.executeUpdate(insertQuery);

			} catch (SQLException e) {
				System.err.println("Bad SQL command.");
				System.err.println("Msg: " + e.getMessage());
				System.exit(1);

			}

		}

	}
}
