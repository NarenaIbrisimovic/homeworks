package ba.bitcamp.homework25.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerHttp {

	public static Socket client;
	public static ServerSocket server;

	public ServerHttp() {
		serverClient();
		reciveMessage();
	}

	/**
	 * Start Http server and wait client to connect.
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

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			while (true) {
				String str = reader.readLine();
				if (str.equals("request")) {
					sendResponse();
				}
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method for send response.
	 */
	public void sendResponse() {
		String str = readFileContent();
		String header = "<HTML>\n<HEAD>\n</HEAD>\n<BODY>\n";
		String footer = "</BODY>\n</HTML>";
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			writer.write(header);
			writer.write(str);
			writer.write(footer);
			writer.newLine();
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method for read file.
	 * 
	 * @return fileContent
	 */
	public String readFileContent() {
		BufferedReader br = null;
		String fileContent = "";

		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(
					"src/ba/bitcamp/homework25/task01/Text.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				fileContent += convertToHTML(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return fileContent;

	}

	/**
	 * Method for convert to HTML.
	 * 
	 * @param plainText
	 * @return HTML
	 */
	public String convertToHTML(String plainText) {
		String[] stringArray = plainText.split(",", 2);
		String HTML = "<a href=\"" + stringArray[1] + "\">" + stringArray[0]
				+ "</a>\n";
		return HTML;
	}

	public static void main(String[] args) {

		new ServerHttp();

	}

}
