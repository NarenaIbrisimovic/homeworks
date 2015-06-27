package ba.bitcamp.homeworkW02;

public class Task8 {

	public static void main(String[] args) {
	String a = "www.nekastranica.com?name=John&&surname=Stark";
	int length =a.length();
	char Slovo;
	boolean var = false;

	for (int i=0; i<=length-1;i++){
		Slovo = a.charAt(i);
	
		if (var == true){
			if (Slovo == '&'){
				System.out.println(" ");
			}else {
				System.out.print(Slovo);
			}
		}
		if (Slovo == '?'){
			var = true;
		}
	}

	}

}
