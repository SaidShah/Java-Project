package learningSinglyLinkedLists;

public class App {

	public static void main(String[] args) {

		
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insert(150);
		myList.insert(8);
		myList.insert(1990);
		myList.insert(82);
		myList.insert(1220);
		myList.insert(650);
		myList.insert(356);
		myList.insert(91);
		
		myList.displayList();
		myList.deleteFirst();
		myList.deleteFirst();
		myList.displayList();
		
		myList.insert(8888888);
		myList.insertLast(99999);
		myList.displayList();
		

	}

}
