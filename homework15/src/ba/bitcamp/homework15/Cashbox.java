package ba.bitcamp.homework15;

public class Cashbox {
	private String name;
	private Integer money;

	public Cashbox(String name) {
		this.name = name;
		this.money =10;
	}

	/**
	 * 
	 * @param money Money is add.
	 */
	public void addMoney(int money) {
		this.money += money;
	}

	public void clear() {
		this.money = 0;
	}

	
	/**
	 * Print information about Cashbox.
	 */
	public void printInformation() {

		if (money == 0) {
			System.out.println("It's empty");
		} else if (money > 0 && money <= 20) {
			System.out.println("There's some, but not much");
		} else if (money > 20 && money <= 100) {
			System.out.println("There's some");
		} else if (money > 100) {
			System.out.println("There is lot");
		}

	}
}
