package genericClasses;

public class Demo {

	public static void main(String[] args) {

		Point p1 = new Point(1,2);// you can use any data type because its a generic class
		Point p2 = new Point(1.1,1.2);// but its not recommended to do this 
		Point p3 = new Point("one","two");
		
		
		Point <Integer> p4 = new Point<>(1,2);// this is the better way to do it because you can 
												// indicate the data type 
		Point <Double> p5 = new Point<>(1.1,1.2);
		Point <String> p6 = new Point<>("One point one","two point two");// its always best practice to indicate the data type
		
		int x = (Integer)p1.getX();// in order for a generic type to work you have to cast it unless the data
									// type is indicated
									// when creating the object
		String y = p2.getY().toString();// when you use to string to get a value
										// it can convert any primitive value to a string 
										// but its always best to indicate the data type when creating the object
		
		
		System.out.println(" P1 "+p1.toString());
		System.out.println(" P2 "+p2.toString());
		System.out.println(" P3 "+p3.toString());
		System.out.println(" P4 "+p4.toString());
		System.out.println(" P5 "+p5.toString());
		System.out.println(" P6 "+p6.toString());
		
		printPoint(p1);
		printPoint(p2);
		printPoint(p3);
		//printPoint(p6);/// see it dosen't work because the method extends the number class and the data types 
						// have to be in the number class
		
		
	}
	public static void printPoint(Point<? extends Number> point) {// this is how you restrict a certain datatype
		System.out.println(point);
		
		
	}

}
