package ba.bitcamp.homework.task04;

import ba.bitcamp.homework.task03.Book;
import ba.bitcamp.homewok.task02.Author;

public class Bookstore {
	private String bookstoreName;
	private Book[] books;

	public Bookstore(String bookstoreName, Book[] books) {
		super();
		this.bookstoreName = bookstoreName;
		this.books = books;
	}

	/**
	 * 
	 * @return bookstoreName
	 */
	public String getBookstore() {
		return bookstoreName;
	}

	/**
	 * 
	 * @param a Author 
	 * @return bookList
	 */
	public String getBookName(Author a) {
		String bookList = "";
		for(int i = 0; i < this.books.length; i++){
			if(a.equals(this.books[i].getAuthor())){
				bookList+= books[i].getNameOfBook() + "\n";
			}		
		}
		return bookList;

		

	}

}
