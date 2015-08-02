package ba.bitcamp.homework24Networking;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame {

	private JTextField message = new JTextField(30);
	private JTextArea conversation = new JTextArea();
	private JButton button = new JButton("send");
	private JScrollPane scroll = new JScrollPane(conversation);
	private JPanel panel = new JPanel();
	Socket client;

	public Client() {
		
		createWindow();
		connectToServer();
		reciveMessage();
	}

	
	/**
	 * Create window.
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
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("ClientChat");
		button.addActionListener(new Action());
		message.addKeyListener(new Action());

	}

	/**
	 * Connect to server using ip address and host.
	 */

	private void connectToServer() {
		try {
			client = new Socket(InetAddress.getLocalHost(), 9999);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method for recive messsage.
	 */
	private void reciveMessage() {

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			while (true) {
				String str = reader.readLine();
				conversation.append("Server: " + str + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method for send message to server.
	 */
	private void sendMessage() {
		String str = message.getText();

		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			writer.write(str);
			writer.newLine();
			writer.flush();
			conversation.append("Client: " + str + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

		message.setText("");
	}

	public class Action extends KeyAdapter implements ActionListener {

		/**
		 * Message is sent when the button clicked.
		 */

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				sendMessage();

			}

		}

		/**
		 * Message is sent when eneter key clicked.
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				sendMessage();
			}
		}

	}

	public static void main(String[] args) {
		new Client();

	}

}
