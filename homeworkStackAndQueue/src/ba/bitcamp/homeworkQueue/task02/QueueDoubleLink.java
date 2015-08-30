package ba.bitcamp.homeworkQueue.task02;

import javax.xml.soap.Node;

public class QueueDoubleLink {
	private Node start;
	private Node finish;

	/**
	 * Create constructor
	 * 
	 * @param start
	 * @param finish
	 */
	public QueueDoubleLink() {
		this.start = start;
		this.finish = finish;
	}

	/**
	 * 
	 * @param value
	 *            element to add
	 * @return true if element was add.
	 */
	public boolean add(Double value) {
		Node temp = new Node(value);
		if (start == null) {
			start = temp;
			finish = temp;
		} else if (start == finish) {
			temp.setPrevious(start);
			finish = temp;
			start.setNext(finish);
		} else {
			finish.setNext(temp);
			temp.setPrevious(finish);
			finish = temp;
		}
		return true;
	}

	/**
	 * Retrieves, but does not remove, the head of this queue, or returns null
	 * if queue is empty.
	 * 
	 * @return head of queue, or null if this queue is empty.
	 */

	public Double peek() {
		if (start == null) {
			return null;
		} else {
			return start.getValue();
		}
	}

	/**
	 * Retrieves and removes the head of queue, or returns null if queue is
	 * empty head of queue, or null if queue is empty.
	 * 
	 * @return
	 */
	public Double poll() {
		Double temp = 0.0;
		if (peek() != null) {
			temp = start.getValue();
			start = start.getNext();
			return temp;
		}
		return null;
	}

	/**
	 * Print list.
	 */
	public String toString() {
		if (start == null) {
			return "List is empty.";
		}
		return start.toString();
	}

	private class Node {
		private Double value;
		private Node next;
		private Node previous;

		public Node(Double value) {
			this.value = value;
		}

		public Double getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}
	}
}
