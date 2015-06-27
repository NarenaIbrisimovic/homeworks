package ba.bitcamp.homework.task05;

public class MainDate {

	public static void main(String[] args) {
	Date d = new Date (29,4,2015);
	System.out.println(d);
	for(int i = 1; i <= 350; i++){
		d.DayPassed();
	System.out.println(d);
	}
	

	}

}
