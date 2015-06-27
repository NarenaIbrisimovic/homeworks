package Homework14Book;

public class MainBook {

	public static void main(String[] args) {
		
		/*
		 * Napisati klasu koja predstavlja jednu knjigu. Atributi su sljedeći:
		 * Ime knjige
		 * Godina
		 * Žanr
		 * Da li je bestseller

		 */
		
		Book b1 = new Book ("Tvrdava", 1966, "Psiholoska drama", true);
		Book b2 = new Book ("Joomla templates", 2012, "Web-Content-Management-System",false);
		Book b3 = new Book ("Sreća mladog Ljubovića", 1933, "Drama",true);
		Book b4 = new Book ("Dervis i smrt", 1966, "Drama",true);
		
		
		
		
		System.out.println("Name of book:" +  b1.nameOfBook +"\n" + "Year:"+ b1.year + "\n" +"Genre:" + b1.genre + "\n" + "Bestseller:" + b1.isBestseller);
		System.out.println();
		System.out.println("Name of book:" +  b2.nameOfBook +"\n" + "Year:"+ b2.year + "\n" +"Genre:" + b2.genre + "\n" + "Bestseller:" + b2.isBestseller);
		System.out.println();
		System.out.println("Name of book:" +  b3.nameOfBook +"\n" + "Year:"+ b3.year + "\n" +"Genre:" + b3.genre + "\n" + "Bestseller:" + b3.isBestseller);
		System.out.println();
		System.out.println("Name of book:" +  b4.nameOfBook +"\n" + "Year:"+ b4.year + "\n" +"Genre:" + b4.genre + "\n" + "Bestseller:" + b4.isBestseller);
		System.out.println();
		
		
		/*
		 * Napisati klasu koja predstavlja jednog autora. Atributi su sljedeći:
		 * Ime autora
		 * Godište
		 * Niz knjiga koje je autor napisao.
		 */
		
		
		// Creates array of class Book.
		Book[] books = {b1,b2,b3};
		
		Author a1 = new Author ("Meša Selimovic", 1910, books);
		Author a2 = new Author ("Angie Radtke", 1970, books);
		Author a3 = new Author ("Husejn Dogo Dubravic", 1880, books);
		Author a4 = new Author ("Meša Selimovic", 1910, books);
		
		
		System.out.println("Name of author:" +  a1.nameOfAuthor +"\n" + "Year:"+ a1.year + "\n" +"Books:" + b1.nameOfBook );
		System.out.println();
		System.out.println("Name of author:" +  a2.nameOfAuthor +"\n" + "Year:"+ a2.year + "\n" +"Books:" + b2.nameOfBook );
		System.out.println();
		System.out.println("Name of author:" +  a3.nameOfAuthor +"\n" + "Year:"+ a3.year + "\n" +"Books:" + b3.nameOfBook );
		System.out.println();
		System.out.println("Name of author:" +  a4.nameOfAuthor +"\n" + "Year:"+ a4.year + "\n" +"Books:" + b4.nameOfBook );
		System.out.println();
		
		System.out.println("Count bestseller books:" + countBestSellingBooks (a2));
		System.out.println();
		System.out.println(getNumberOfWrittenBooks(a1,1960,1999));
	}
	
	
	/**
	 * Count bestseller books
	 * @param a author of books
	 * @return counter
	 */
	
	public static int countBestSellingBooks(Author a){
		int counter = 0;
		
		for (int i = 0; i < a.books.length; i++){
			if(a.books[i].isBestseller ){
				counter++;
			}
				
		}
		return counter;
		
	}
	
	//Count how much author had written books in range of year1 and year2.
	
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2){
		int counter = 0;
		for(int i = 0; i < a.books.length; i++){
			if(a.books[i].year >= year1 && a.books[i].year<= year2){
				counter++;
			}
		}
		return counter;
		
	}
	
	
//	public static Author getAuthorWithMostBestsellers(Author[] authors){
//		
//	}


}
