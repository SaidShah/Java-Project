package readMe;

public class ReadMe {

	public static void main(String[] args) {

/*		
 * 
 * the concept of erasure is when the place holder gets replaced during runtime by a data type is 
 * generic classes and interfaces will not hurt your performance because only during runtime is when 
 * performance is important because the place holders get erased and replaced with the actual data type
 * during run time
 * 
*/	
		
		
/*		
 * 
 *  1.  you cannot instantiate type parameter
 *  	like below because the T is a place holder and java will not be able to compile it
*/
	}
	
	/*public class MyClass<T>{
		
		public MyClass() {
			T myObject = new T();
		}
	}*/

	
/*	
 * 
 *  2. you cannot create an array or objects from generic classes
 *  
 *  ArrayList<String> [] a = new ArrayList<>[100];  <-- this is not ok 
 *  Integer[] numbers = new Integer[100];   <-- this is ok
 * 
 *  Because array list is a generic class so you can't make an array from generic classes
 *  any kind of generic class no matter what it is
 *  
*/	
	 
/*	
 * 
 * 3. a generic classe's type parameter cannot be the type of a static field and cannot be 
 * 	  Referred to in a static method
 * 
 * public class MyClass<T>{
 * 		private static T value;// not allowed 
 * 
 * }
 * 
 * public class MyClass<T> {
 * 
 * 		public static void doSomething(){	
 * 			T myValue;// not allowed
 * 	}
 * }
 * 
 * 
 * 	4. You cannot make an exception class generic and you must write specific exception classes
 * 
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
