package genericMethods;

public class GenericMethodDemo {

	public static void main(String[] args) {

		
		String[] names = {"adam","bill","cathy","mike","joe"};
		//Integer[] numbers = {new Integer(1),new Integer(4), new Integer(9)}; <- the correct way to do it
		Integer[] numbers = {1,4,8};// auto boxing, java creates new objects for you
		//int x = new Integer(6);// auto Unboxing
		
		display(names);
		display(numbers);	
		
	//	display2(names);
		display2(numbers);

	}
	
	
	/*private static void display(String[] names) {
		for(String str: names) {
			System.out.print(str+", ");
		}
		System.out.println();
	}

	private static void display(Integer[] numbers) {
		for(Integer nums: numbers) {
			System.out.print(nums+", ");
		}
		System.out.println();
	}*/
	
	private static <E extends Number> void display2(E[] myArray) {// upper bound Constraining, Number is a class
				//The extends Number means that the place holder is only holding the place for 
		// the Number class and its sub classes, so we are constraining the place holder for certain classes and its
		// a good way to be restrictive if you don't want to allow certain classes or data types so, its a good practice
		// to restrain some data types so for our previous project we would create an interface and have all of our classes
		// would extend that interface so when you would extend this method from that interface we can only use this for our 
		// classes, you would implement the interface in your other classes and extend the generic method using that interface
		// and because you are already using a superclass and you are only allowed one super class but you can implement 
		// as many interfaces as you want

		for(E e: myArray){// even though you are using a interface in a generic method you would use 
			System.out.print(e+", ");// the extends keyword and not the implements keyword in the method
			}
			System.out.println();
			}
	
	
	
	
	
	
	private static <E> void display(E[] myArray) {// the E is a generic place holder which says it should accept some data type 
								// (any data type) and the E could be any letter but E is convention when using arrays
								// and the <E> shows that it is definitely a place holder and your are telling java that
			// and you can replace the void with a <T> to return what ever you want, that would be the generic return type
		
			for(E e: myArray){
				System.out.print(e+", ");
			}
			System.out.println();
	}
	
	
	
	
	
	
	
	
	
}











