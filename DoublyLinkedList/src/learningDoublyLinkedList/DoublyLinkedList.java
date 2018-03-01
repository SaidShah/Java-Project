package learningDoublyLinkedList;

public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int tempData) {
		Node newNode = new Node();
		newNode.data = tempData;

		if (isEmpty()) {
			last = newNode;// if empty, last will refer to the new node being created
		} else {
			first.previous = newNode;
		}

		newNode.next = first;// the new nodes next field will point to the old first
		this.first = newNode;
	}

	public void insertLast(int tempData) {
		Node newNode = new Node();
		newNode.data = tempData;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;// assigning old last into newNode
			newNode.previous = last;// the old lasts will be the newNodes previous
		}
		last = newNode;// the linked lists last field should point to the new node
	}

	// assume thats its a non empty list
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) {// there is only one item in the list
			last = null;
		} else {
			first.next.previous = null;
		}

		first = first.next;// we are assigning the reference of the node following the old first node to
							// the first
							// field in the linked list
		return temp;// return deleted old first Node
	}

	// assume a non empty list
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) {// we only have one node in this list
			first = null;
		} else {
			last.previous.next = null;// the last nodes previous nodes next field will point to null
		}
		last = last.previous;
		return temp;
	}

	// assume a non empty list
	public boolean insertAfter(int key, int data) {
		Node current = first;// we start from the beginning of the list
		while (current.data != key) {// as long as we have not found the data or the key
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;

		if (current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;// new nodes next field should point to the node ahead of the current one
			current.next.previous = newNode;// the node ahead of current, its previous field should point to current
		}
		newNode.previous = current;
		current.next = newNode;
		return true;

	}
	
	public Node deleteKey(int key) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if(current==null) {// we reached end of list and just return null
				return null;
			}
		}
		
		if(current == first) {
			first = current.next;// make the first field point to the node following current since current will be deleted
		}else {
			
			current.previous.next = current.next;
		}
		if(current ==last) {
			last = current.previous;
		}else {
			current.next.previous = current.previous;
		}
		return current;
	}
	
	public void displayForward() {
		System.out.println("First to Last ");
		Node current = first;// start from the beginning
		while(current!=null) {
			current.displayNode();// call the display method of the node
			current = current.next;// move to the next node
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("Last to First ");
		Node current = last;// start from the end
		while(current!=null) {
			current.displayNode();// call the display method of the node
			current = current.previous;// move to the next node
		}
		System.out.println();
	}

}












