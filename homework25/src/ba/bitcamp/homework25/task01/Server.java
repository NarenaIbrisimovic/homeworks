package ba.bitcamp.homework25.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Server {

	public static Socket client;
	public static ServerSocket server;

	public Server() {
		serverClient();
		reciveMessage();

	}

	/**
	 * Start server and wait client to connect.
	 */
	public void serverClient() {

		try {
			server = new ServerSocket(9988);
			client = server.accept();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Method for recive message.
	 */
	public void reciveMessage() {
		String link;

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			while (true) {
				String str = reader.readLine();
				if (str.length() > 0) {
					link = messageSplit(str);
					if (isURLValid(link) && isURLExists(link)) {
						BufferedWriter writer = new BufferedWriter(
								new FileWriter(
										"src/ba/bitcamp/homework25/task01/Text.txt",
										true));
						writer.write(str + "\n");
						writer.flush();
						writer.close();
					}
				}
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Split receive message
	 * @param message
	 * @return second part of string or empty string
	 */
	public String messageSplit(String message) {
		String[] str = message.split(",", 2);
		try {
			return str[1];
		} catch (IndexOutOfBoundsException e) {
			return "";
		}

	}

	/**
	 * Method for valid url.
	 * @param url receive url.
	 * @return true or false
	 */

	public boolean isURLValid(String url) {
		String regex = "^(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
			Pattern patt = Pattern.compile(regex);
			Matcher matcher = patt.matcher(url);
			return matcher.matches();
		} catch (RuntimeException e) {
			return false;
		}
	}

	/**
	 * Method for is erl exist
	 * @param url receive url
	 * @return true or false if url exist or not.
	 */
	public boolean isURLExists(String url) {
		HttpURLConnection httpUrlConn;
		try {
			httpUrlConn = (HttpURLConnection) new URL(url).openConnection();
			httpUrlConn.setRequestMethod("HEAD");
			return (httpUrlConn.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static void main(String[] args) {
		new Server();

	}

}
