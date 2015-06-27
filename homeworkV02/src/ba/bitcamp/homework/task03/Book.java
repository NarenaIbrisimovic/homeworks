package ba.bitcamp.homework.task03;

import ba.bitcamp.homewok.task02.Author;



public class Book  {
	private String nameOfBook;
	private Integer price;
	private Integer stock;
	public Author author;

	public Book(String nameOfBook, Integer price, Integer stock, Author author) {
		super();
		this.nameOfBook = nameOfBook;
		this.price = price;
		this.stock = stock;
		this.author = author;
	}

	/**
	 * 
	 * @return nameOfBook
	 */
	public String getNameOfBook() {
		return nameOfBook;
	}

	/**
	 * 
	 * @param nameOfBook set name of book
	 */
	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	/**
	 * 
	 * @return price of book
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price set price of book
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * 
	 * @return stock of book
	 */
	public Integer getStock() {	
		return stock;
	}

	/**
	 * 
	 * @param numberOfBook 
	 * @return books on stock
	 */
	public int fillBooks(int numberOfBook){
		this.stock = this.stock + numberOfBook;
		return this.stock;
	}
	
	/**
	 * 
	 * @param numberOfBook
	 * @return sell books
	 */
	public int sellBooks(int numberOfBook){
		this.stock = this.stock - numberOfBook;
		return this.stock;
	}
	
	/**
	 * 
	 * @return author
	 */
	public Author getAuthor() {
		return author;
	}
	
	/**
	 * 
	 * @return stock of book
	 */
	public String isThereBook(){
		String s = "";
		if (this.stock == 0){
			return("Books are sold");
		}else {
			return("Stock : " + Integer.toString(this.stock));
		}
	}

}
