package ba.bitcam.homeworkStack.task02;

import java.util.EmptyStackException;

import javax.xml.soap.Node;

public class StackStringLink {
	
	private Node start;
	
	public StackStringLink(){
		this.start = null;
	}
	
	
	/**
	 * Test if this stack is empty.
	 * @return true if stack have not items.
	 */
	public boolean isEmpty() {
		if (start == null){
			return true;
		}else{
			return false;
		}
		
	}
	
	/**
	 * Pushe an item onto the top of stack.
	 * @param value Item that is pushed.
	 * @return Item that is pushed.
	 */
	public String push (String value){
		if(start == null){
			start = new Node(value);
		}else{
			Node temp = new Node(value);
			temp.setNext(start);
			start = temp;
		}
		return value;
		
	}
	
	/**
	 * Looks at the object at the top of stack without removing it from the
	 * stack.
	 * @return The object at the top of stack.
	 * @throws EmptyStackException is stack is empty.
	 */
	public String peek() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			return start.getValue();
		}
	}
	
	
	private class Node{
		private Node next;
		private String value;
		
		
		public Node(String value){
			this.value = value;
			
		}


		public Node getNext() {
			return next;
		}


		public void setNext(Node next) {
			this.next = next;
		}


		public String getValue() {
			return value;
		}


		public void setValue(String value) {
			this.value = value;
		}
		
		
	}

}
