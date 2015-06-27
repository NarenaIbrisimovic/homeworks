package ba.bitcamp.homework.task04;

import ba.bitcamp.homewok.task02.Author;
import ba.bitcamp.homework.task03.Book;

public class MainBookstore {
	public static void main(String[] args) {
		Author a = new Author("Mesa Selimovic", "rahmetlija@hotmail.com","M");
		Author a1 = new Author("Ivo Andric", "rahmetlija@hotmail.com","M");
		
		Book[] b = new Book[3];
		b[0] = new Book("Tvrdava", 21, 10, a);
		b[1] = new Book("Na Drini cuprija", 14, 5, a1);
		b[2] = new Book("Dervis i smrt", 11, 12, a);
	
		
		
		Bookstore bs = new Bookstore ("Sahinpasic",b);
		System.out.println(bs.getBookName(a));

	}
}
