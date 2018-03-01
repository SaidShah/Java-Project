package switchingDataTypes;

import java.util.Arrays;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		String fruits[] = {"cherry", "apple","pear","melon"};
		LinkedList<String> fruitList = new LinkedList<String>(Arrays.asList(fruits));// initializing Linked List and passing converting an array 
		
		fruitList.add("Sausage");// adding to the end of the list
		fruitList.addFirst("Building");// adding to the beginning of the list
		
		fruits=fruitList.toArray(new String[fruitList.size()]);// converting a linked list back to an array after changes have been made
		
		for(String printMe:fruits) {
			System.out.printf("%s, ",printMe);
		}
		
		
		
	}

}
