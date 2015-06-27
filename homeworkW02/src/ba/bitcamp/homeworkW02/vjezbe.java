package ba.bitcamp.homeworkW02;

public class vjezbe {

	public static void main(String[] args) {
		String a = "http:/stranica.com/homepage";
		int pocetak = a.indexOf('/');
		int kraj = a.indexOf('/',pocetak+1);
		System.out.println(pocetak);
		System.out.println(kraj);
		System.out.println(a.substring(pocetak+1,kraj));
	}

}
