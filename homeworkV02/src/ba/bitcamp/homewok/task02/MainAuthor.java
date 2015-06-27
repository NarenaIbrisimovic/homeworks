package ba.bitcamp.homewok.task02;

public class MainAuthor {

	public static void main(String[] args) {
		Author a = new Author("Mesa Selimovic", "rahmetlija@hotmail.com","M");
		Author a1 = new Author("Mesa Selimovic", "rahmetlija@hotmail.com","F");

		
		System.out.println(a);
		//a.getGender();
		a.setGender("l");
		System.out.println(a);
		
		a.setEmail("narena@ibrisimovic.com");
		//a.getEmail();
		System.out.println(a);
	
		a.setGender("P");
		//a.getGender();
		System.out.println(a);
		System.out.println(a.getGender());
		
	
		
		
	
		
		
		
	}

}
