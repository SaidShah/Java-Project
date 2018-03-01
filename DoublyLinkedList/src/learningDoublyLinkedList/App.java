package learningDoublyLinkedList;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(125);
		myList.insertFirst(66);
		myList.insertFirst(784);
		myList.displayForward();
		myList.displayBackward();
		
		
		myList.insertAfter(66, 9999);
		myList.displayForward();
		
		myList.insertLast(65658);
		myList.insertLast(8888);
		myList.displayForward();
		
		myList.deleteKey(125);
		myList.displayForward();
		
	}

}
