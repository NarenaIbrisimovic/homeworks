package ba.bitcamp.homework.part2;

import ba.bitcamp.homework.part1.Computer;

public class ArrayManipulation {

	/**
	 * Extends array by one and inserts null at new index.
	 * 
	 * @param c
	 *            Array of computers
	 * @return Array of computers
	 */

	public static Computer[] extendArray(Computer[] c) {
		Computer[] temp = new Computer[c.length + 1];
		System.arraycopy(c, 0, temp, 0, c.length);
		return temp;
	}
	
	/**
	 * Removes object from array on given index.
	 * @param c Array of computers
	 * @param i
	 * @return temp
	 */

	public static Computer[] shrinkArray(Computer[] c, int i) {
		Computer[] temp = new Computer[c.length - 1];
		System.arraycopy(c, 0, temp, 0, i);
		System.arraycopy(c, i + 1, temp, i, c.length - i - 1);
		return temp;
	}
}
