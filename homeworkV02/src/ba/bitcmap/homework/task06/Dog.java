package ba.bitcmap.homework.task06;
/**
 * Class representing dogs.
 * Inherits atributes and methods from class Pet.
 * 
 * @author ibrisimovicnarena
 *
 */

public class Dog extends Pet {
	private String breed;
	/**
	 * 
	 * @param breed 
	 * @param name 
	 * @param year
	 */

	public Dog(String breed, String name, Integer year) {
		super(name, year, "dog");
		this.breed = breed;

	}

	/**
	 * 
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * 
	 * @param breed The breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * Returns "Av av"
	 */
	public String toString() {
		return "Av av";
	}

}
