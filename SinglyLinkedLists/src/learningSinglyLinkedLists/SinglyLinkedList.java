package learningSinglyLinkedLists;

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insert(int tempData) {// used to insert in the beginning of the list
		Node newNode = new Node();
		newNode.data = tempData;
		newNode.next = first;
		first = newNode;

	}

	public Node deleteFirst() {
		Node tempNode = first;
		first = first.next;

		return tempNode;
	}

	public void displayList() {
		System.out.println("list (first --> last) ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	public void insertLast(int tempInt) {// used to insert into the end of the list
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = tempInt;
		current.next = newNode;
	}

}
