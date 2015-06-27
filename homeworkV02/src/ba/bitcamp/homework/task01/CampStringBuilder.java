package ba.bitcamp.homework.task01;
/**
 * This class was conceived to imitate StringBuilder class. 
 * 
 * @author ibrisimovicnarena
 *
 */

public class CampStringBuilder {
	private char[] chars;

	
	public CampStringBuilder(char[] characters) {
		super();
		this.chars = characters;
	}

	/**
	 * Put object in the end.
	 * @param o
	 */
	public void append(Object o) {
		System.out.println(this.toString() + o.toString());
	}

	/**
	 * Put object on the beginning.
	 * @param o
	 */
	public void prepend(Object o) {
		System.out.println(o.toString() + this.toString());
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < chars.length; i++) {
			s += chars[i] + ",";
		}
		return s;
	}

}
