package learnCircularLinkedList;



public class App {

	public static void main(String[] args) {


		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(150);
		myList.insertFirst(8);
		myList.insertFirst(1990);
		myList.insertFirst(82);
		myList.insertFirst(1220);
		myList.insertFirst(650);
		myList.insertFirst(356);
		myList.insertFirst(91);
		
		myList.displayList();
		myList.deleteFirst();
		myList.deleteFirst();
		myList.displayList();
		
		myList.insertFirst(8888888);
		myList.insertLast(99999);
		myList.displayList();
		
	}

}
