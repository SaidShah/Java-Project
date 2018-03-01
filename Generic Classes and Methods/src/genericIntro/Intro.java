package genericIntro;

import java.util.ArrayList;

public class Intro {

	public static void main(String[] args) {
		// this is a generic data type(Class) because it allows you to specify the type of data
		// but if you don't specify you can add anything you want but thats not good practice
		// always use angle brackets and specify what data type you are using
		//	example ArrayList<String> list = new ArrayList<>();
		
		ArrayList myList = new ArrayList();
		myList.add(1);
		myList.add("john doe");
		myList.add(true);
		myList.add(2.5);
		
	}
	
	
	
}
