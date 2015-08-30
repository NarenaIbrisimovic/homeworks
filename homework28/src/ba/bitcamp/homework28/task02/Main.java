package ba.bitcamp.homework28.task02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static Connection conn = null;

	public static void main(String[] args) {

		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded");
			conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/narenaibrisimovic/baze.db");
			System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC library is not loaded.");
			System.out.println("Reason:" + e.getMessage());
			System.exit(1);
		} catch (SQLException e) {
			System.err.println("Could not connect to the database.");
			System.err.println("Reason:" + e.getMessage());
			System.exit(1);

		}

		new Window();
	}
	


}
