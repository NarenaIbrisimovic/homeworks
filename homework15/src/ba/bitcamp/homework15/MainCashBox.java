package ba.bitcamp.homework15;

public class MainCashBox {

	public static void main(String[] args) {
		Cashbox c = new Cashbox("For Sea");
		
		c.printInformation(); 
		c.addMoney(330);
		c.printInformation();
		c.addMoney(100);
		c.printInformation(); 
		c.clear();
		c.printInformation();
		

	}

}
