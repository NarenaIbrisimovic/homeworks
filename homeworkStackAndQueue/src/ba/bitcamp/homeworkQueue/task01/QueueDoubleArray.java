package ba.bitcamp.homeworkQueue.task01;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueDoubleArray {

	public Double[] arr;

	public QueueDoubleArray() {
		this.arr = new Double[0];
	}

	public String toString() {
		return Arrays.toString(arr);
	}

	/**
	 * Add element if it is possible
	 * 
	 * @param value
	 *            element to add
	 * @return true if element was add
	 */
	public boolean add(Double value) {
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = value;
		return true;
	}

	/**
	 * Retrieves and removes the head of queue, or returns null if queue is
	 * empty.
	 * 
	 * @return The head of queue, or null if queue is empty.
	 */
	public Double peek() {
		if (arr.length > 0) {
			return arr[0];
		} else {
			return null;
		}
	}

	/**
	 * Retrieves, but does not remove, the head of queue.
	 * 
	 * @return The head of this queue.
	 * @throws NoSuchElementException
	 */
	public Double element() throws NoSuchElementException {
		if (arr.length > 0) {
			return arr[0];
		} else {
			throw new NoSuchElementException();
		}
	}

	/**
	 * Retrieves and removes the head of queue.
	 * 
	 * @return The head of queue.
	 * @throws NoSuchElementException
	 */
	public Double remove() throws NoSuchElementException {
		if (arr.length > 0) {
			Double temp = arr[0];
			arr = Arrays.copyOfRange(arr, 1, arr.length);
			return temp;
		}
		throw new NoSuchElementException();
	}

}
