package genericClassesWith2Fields;

public class Demo {

	public static void main(String[] args) {

			Point<Integer,String> p1 = new Point(1,"2.2");// you should indicate the data types if you have multiple
															// types of data and multiple place holders for the generic
															// class
			
			String x = p1.getX().toString();// you have to be careful because when your getting the data it has to be a 
									// same data type or it will not work
			
			double y = Double.parseDouble(p1.getY());// always use the correct data type or you have to parse it or use 
												// the to string method to convert the data to a string
			
			Double z = Double.valueOf(p1.getY());
			System.out.println(z);
		//	Point<Integer,String> p2 = new Point(1);
	}

}
