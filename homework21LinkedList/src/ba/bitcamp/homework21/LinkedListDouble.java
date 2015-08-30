package ba.bitcamp.homework21;

public class LinkedListDouble {
	private Node start;
	private int size;

	public LinkedListDouble() {
		start = null;
		size = 0;
	}

	/**
	 * Constructor that receives the LinkedListDouble object and copies all
	 * elements in new list.
	 * 
	 * @param list
	 */

	public LinkedListDouble(LinkedListDouble list) {

		Node temp = list.start;
		while (temp.getNext() != null) {
			add(temp.getNext());
			temp = temp.getNext();
		}
	}

	private void add(Node next) {
		// TODO Auto-generated method stub

	}

	/**
	 * Returns the number of elements in the list.
	 * 
	 * @return Number of elements in the list.
	 */

	public int size() {
		return size();
	}

	/**
	 * Inserts the specified element into list and increases number of elements
	 * in the list.
	 * 
	 * @param value
	 *            the element add.
	 */
	public void add(Double value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node temp = getLastNode();
			temp.setNext(new Node(value));
		}
		size++;
	}

	/**
	 * Retrieves the last element in the list.
	 * 
	 * @return Last element in the list.
	 */
	private Node getLastNode() {
		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}

	/**
	 * Removes element from the list at inputed index and lowers number of
	 * elements in the list.
	 * 
	 * @param index
	 *            of element to remove.
	 */
	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		Node previouse = getPreviousNode(temp);
		previouse.setNext(temp.getNext());
		size--;
	}

	/**
	 * Retrieves and returns the element that is previous than inputed element.
	 * 
	 * @param temp
	 * @return Previous node in regard to inputed node.
	 */
	private Node getPreviousNode(Node temp) {
		if (temp == null) {
			return null;

		}
		Node temp1 = start;
		while (temp1.getNext() != temp) {
			temp1 = temp1.getNext();
		}

		return temp;
	}

	/**
	 * Retrieves the first element in the list.
	 * 
	 * @return First element in the list.
	 */
	public Double getFirst() {
		if (start == null) {
			return null;
		}
		return start.getValue();
	}

	/**
	 * Retrieves the last element in the list.
	 * 
	 * @return Last element in the list.
	 */
	public Double getLast() {
		if (start == null) {
			return null;
		}
		return getLastNode().getValue();
	}

	/**
	 * Delete first element of the list.
	 */
	public void deleteFirst() {
		start = start.getNext();

	}
	
	/**
	 * Delete last element of the list.
	 */
	public void deleteLast(){
		remove(size()-1);
	}

	
	/**
	 * Print list
	 */
	public String toString() {
		if (start == null) {
			return "The list is empty.";
		}
		return start.toString();
	}
	
	
}

/**
 * Class Node
 *
 */
class Node {
	private double value;
	private Node next;

	public Node(double value) {
		this.value = value;
	}

	
	public double getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	/**
	 * Print lists.
	 */
	public String toString() {
		if (next == null) {
			return value + "";
		}
		return value + ", " + next.toString();
	}


}