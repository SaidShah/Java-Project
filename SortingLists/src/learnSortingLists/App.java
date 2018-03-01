package learnSortingLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		String[] stuff = {"John","Michael","Adam","Paul","Brian","Stewie","Charlie"};
		List<String> namesList = Arrays.asList(stuff);// takes the array and converts it into a list
		
		Collections.sort(namesList);// sorts the list in alphabetical order
		System.out.printf("%s, ",namesList);
		System.out.println();
		Collections.sort(namesList,Collections.reverseOrder());// takes the list and reverses it
		System.out.printf("%s, ",namesList);
		
		
	}

}
