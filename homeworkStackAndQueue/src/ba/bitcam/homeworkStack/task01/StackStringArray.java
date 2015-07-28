package ba.bitcam.homeworkStack.task01;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackStringArray {
	private String[] array;

	public StackStringArray() {
		this.array = new String[0];
	}

	/**
	 * Prints the elements in the stack.
	 */
	public String toString() {
		return Arrays.toString(array);
	}

	/**
	 * Test if this stack is empty.
	 * 
	 * @return true if stack have not items.
	 */
	public boolean isEmpty() {
		return array.length == 0;

	}

	/**
	 * Push an item on top of stack
	 * 
	 * @param s
	 *            string to be push in stack
	 * @return s
	 */
	public String push(String s) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = s;
		return s;
	}

	/**
	 * Remove the object at the top of stack.
	 * @return string at the top of stack.
	 * @throws EmptyStackException If stack is empty.
	 */
	public String pop() throws EmptyStackException {
		if (array.length == 0) {
			throw new EmptyStackException();
		}
		array = Arrays.copyOf(array, array.length - 1);
		String s = array[array.length - 1];

		return s;

	}
	
	/**
	 * Looks at the String at the top of this stack without removing it from the stack.
	 * @return string at the top of stack.
	 * @throws EmptyStackException If stack is empty.
	 */
	public String peek() throws EmptyStackException {
		if(array.length == 0)
			throw new EmptyStackException();
		return array[array.length - 1];
	}

}
