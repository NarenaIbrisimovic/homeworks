package ba.bitcamp.homework.task01;

public class Main {
	 public static void main(String [] args){
		  char [] chars = {'a', 'b', 'c'};
		  String s = "zzzzzzzzzzzzz";
		  char [] c = {'z', 'z', 'z', 'z', 'z'};
		  CampStringBuilder sb = new CampStringBuilder(chars);
		  
		  System.out.println();
		  System.out.println(sb.toString());
		  sb.append(s);
		  System.out.println(sb.toString());
		  sb.prepend(s);
	 }

}
