package ba.bitcamp.homeworkW02;

public class Movie {

	
		String movieName;
		int year;
		String genre;
		String nameDirector;
		int rateMovie;
		boolean Oscar;
		
		
		public Movie (String m, int y, String g, String n, int r, boolean O){
			movieName = m;
			year = y;
			genre = g;
			nameDirector = n;
			rateMovie = r;
			Oscar = O;
			
		}
		
		public String toString(){
			   String s="";
			   
			   s = s + "Movi name:" + movieName + "\n";
			   s = s + "Year:" + year + "\n";
			   s = s + "Genre" + genre + "\n";
			   s = s + "Director" + nameDirector + "\n";
			   s = s + "Rate Movie"+ rateMovie + "\n";
			   s = s + "Has movie got Oscar?" + Oscar;
			   
			   return s;

		}
	

}
