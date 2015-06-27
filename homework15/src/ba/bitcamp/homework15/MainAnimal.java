package ba.bitcamp.homework15;

public class MainAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal("Animal1",1, 1);
		Animal a2 = new Animal("Animal2",2, 3);
		
		a1.printStatus();
		
		a2.printStatus();
		
		Animal.cycleDayNight();
		Animal.setAmountOfWater(3);
		
		a1.printStatus();
		a2.printStatus();

	}

}
