package ba.bitcamp.homework.task03;

import ba.bitcamp.homewok.task02.Author;

public class MainBook {

	public static void main(String[] args) {
		Author a = new Author("Mesa Selimovic", "rahmetlija@hotmail.com","M");
		Author a1 = new Author("Ivo Andric", "rahmetlija@hotmail.com","M");
		
		Book[] b = new Book[3];
		b[0] = new Book("Tvrdava", 21, 10, a);
		b[1] = new Book("Na Drini cuprija", 14, 5, a1);
		b[2] = new Book("Dervis i smrt", 11, 12, a);
	
		System.out.println(b[0].isThereBook());
		b[0].fillBooks(20);
		System.out.println(b[1].isThereBook());
		b[1].sellBooks(1);
		System.out.println(b[1].isThereBook());
		
	}

}
