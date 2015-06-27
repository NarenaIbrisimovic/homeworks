package ba.bitcmap.homework.task06;

/**
 * Class representing cats.
 * Inherits atributes and methods from class Pet.
 * 
 * @author ibrisimovicnarena
 *
 */

public class Cat extends Pet{

	/**
	 * 
	 * @param name Cat's name
	 * @param year Year
	 */
	public Cat(String name, Integer year){
		super(name,year, "Cat");
		
	}
	
	/**
	 * Returns "Go away human"
	 */
	
	public String toString(){
		return "Go away human";
	}

}
