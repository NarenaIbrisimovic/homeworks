package ba.bitcamp.homework26.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	ServerSocket server;
	Socket client;
	BufferedReader reader;
	BufferedWriter writer;
	File file;

	public Server() {
		serverClient();
		isFileExsits();

	}

	/**
	 * Start server and wait client to conect.
	 */
	public void serverClient() {

		try {
			server = new ServerSocket(9999);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	/**
	 * Method cheks is file exists. If exists return 1 or 0.
	 */
	public void isFileExsits() {
		while (true) {

			try {
				client = server.accept();
				reader = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
				writer = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
				file = new File(reader.readLine());
				if (file.exists()) {
					writer.write("1");
				} else {
					writer.write("0");
				}
				writer.newLine();
				writer.flush();
				writer.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {

		new Server();
	}

}
