package ba.bitcamp.homework24Networking;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ba.bitcamp.homework24Networking.Client.Action;

public class Server extends JFrame {

	private JTextField message = new JTextField(30);
	private JTextArea conversation = new JTextArea();
	private JButton button = new JButton("send");
	private JScrollPane scroll = new JScrollPane(conversation);
	private JPanel panel = new JPanel();
	public static Socket client;
	public static ServerSocket server;

	public Server() {

		createWindow();
		serverClient();
		reciveMessage();
	}

	/**
	 * Create widnow.
	 */
	public void createWindow() {
		setLayout(new BorderLayout());

		conversation.setEditable(false);
		add(scroll, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		panel.add(message);
		panel.add(button);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(0, 0);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("ServerChat");
		button.addActionListener(new Action());
		message.addKeyListener(new Action());

	}

	/**
	 * Start server and wait client to connect.
	 */
	public void serverClient() {

		try {
			server = new ServerSocket(9999);
			client = server.accept();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Method for recive message.
	 */
	public void reciveMessage() {

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			while (true) {
				String str = reader.readLine();
				conversation.append("Client:" + str + "\n");
				someAction(str);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method for send message.
	 */
	public void sendMessage() {
		String str = message.getText();

		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			writer.write(str);
			writer.newLine();
			writer.flush();

			conversation.append("Server:" + str + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

		message.setText("");
	}

	private class Action extends KeyAdapter implements ActionListener {

		/**
		 * Message is sent when the button is clicked.
		 */

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				sendMessage();

			}

		}

		/**
		 * Message is sent when eneter key is clicked.
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				sendMessage();
			}
		}

	}

	/**
	 *If first word /web,web page will be open.
	 *If first word /file, file will be open.
	 *If first word / delete, fill will be delete.
	 *If first word /list, client will recive a message with list of files.
	 * 
	 * @param message client send message.
	 */
	public void someAction(String message) {
		try {
			String[] str = message.split(" ", 2);
			File file = new File(str[1]);

			if (str[0].equals("/web")) {
				Desktop.getDesktop()
						.browse(new URL("http://" + str[1]).toURI());
			} else if (str[0].equals("/open")) {
				Desktop.getDesktop().open(file);
			} else if (str[0].equals("/delete")) {
				file.delete();
			} else if (str[0].equals("/list")) {
				String[] list = file.list();
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				writer.write("Files" + file);
				writer.newLine();
				for (String str1 : list) {
					writer.write(str1);
					writer.newLine();
				}

				writer.flush();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new Server();

	}

}
