package ba.bitcamp.homework26.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 9999);

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			String filePath = "src/ba/bitcamp/homework26/task01/file.txt";

			writer.write(filePath);
			writer.newLine();
			writer.flush();

			System.out.println(reader.readLine());

			writer.close();
			client.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
