package ba.bitcmap.homework.task06;

/**
 * Class representing pets
 * 
 * @author ibrisimovicnarena
 *
 */

public class Pet {
	private String name;
	private Integer year;
	private String sort;

	public Pet(String name, Integer year, String sort) {
		this.name = name;
		this.year = year;
		this.sort = sort;

	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            - set name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * 
	 * @param year
	 *            set year
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * 
	 * @return sort of pets
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * 
	 * @param sort
	 *            set sort of pets
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	public String toString() {

		String s = "Name: " + name + "\n" + "Year: " + year + "\n" + sort
				+ "\n";
		return s;
	}

}
