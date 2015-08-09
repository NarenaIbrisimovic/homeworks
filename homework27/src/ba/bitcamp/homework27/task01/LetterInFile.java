package ba.bitcamp.homework27.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class LetterInFile {
	private BufferedReader fileReader;
	private LinkedBlockingQueue<Runnable> tasks = new LinkedBlockingQueue<Runnable>();
	private ArrayList<Producer> producers = new ArrayList<Producer>();
	private char firstCharacter;
	private static Integer counter = 1;

	/**
	 * Deafut constructor.
	 * 
	 * @param filePath
	 *            file path.
	 */
	public LetterInFile(String filePath) {
		try {
			fileReader = new BufferedReader(new InputStreamReader(
					new FileInputStream(filePath)));
			firstCharacter = (char) fileReader.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	private class Producer extends Thread {

		@Override
		public void run() {
			while (!tasks.isEmpty()) {
				try {
					tasks.take().run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private class Consumer implements Runnable {
		String line;

		public Consumer(String line) {
			this.line = line;
		}

		@Override
		public void run() {
			char temp = ' ';
			
			if(Character.isAlphabetic(firstCharacter)){
				if(Character.isLowerCase(firstCharacter)){
					temp = Character.toUpperCase(firstCharacter);
				} else {
					temp = Character.toLowerCase(firstCharacter);					
				}
			} else {
				temp = firstCharacter;
			}
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == firstCharacter || line.charAt(i) == temp) {
					synchronized (counter) {
						counter++;
					}
				}
			}
		

		}
	}

	/**
	 * Count how many times repetition of first letter in file.
	 */
	public void countLetter() {
		try {
			while (fileReader.ready()) {
				tasks.add(new Consumer(fileReader.readLine()));
			}

			for (int i = 0; i < 8; i++) {
				Producer p = new Producer();
				p.start();
				producers.add(p);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < producers.size(); i++) {
			try {
				producers.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Character:" + firstCharacter +  " "+ "Repeat times:" + counter);
	}

	public static void main(String[] args) {
		LetterInFile l = new LetterInFile("src/ba/bitcamp/homework27/task01/file.txt");
		l.countLetter();

	}

}
