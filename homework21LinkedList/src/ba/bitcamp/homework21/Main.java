package ba.bitcamp.homework21;

public class Main {

	public static void main(String[] args) {
		LinkedListDouble list = new LinkedListDouble();
		
		list.add(123.65);
		list.add(23.89);
		list.add(22.34);
		
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		list.deleteFirst();
		System.out.println(list);
		

	}

}
