package p3DefaultInterfaces;

public class Demo {
	public static void main(String[] args){
	Calculator c1 = new Calculator();
	System.out.println(c1.add(5,5));
	System.out.println(c1.subtract(10,5));
	System.out.println(c1.multiply(50,3));
	System.out.println(c1.divide(50,2));

	intCalculator c2 = new intCalculator(){};

		System.out.println();
		System.out.println(c2.add(5,5));
		System.out.println(c2.subtract(10,5));
		System.out.println(c2.multiply(50,3));
		System.out.println(c2.divide(50,2));


	}
}
