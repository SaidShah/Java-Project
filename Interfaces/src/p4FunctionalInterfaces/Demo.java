package p4FunctionalInterfaces;

public class Demo {

	public static void main(String[] args) {
		intCalculator squared = (a,b) -> a * b;// put the interface then give it a
											// variable name and then the lambda
											// to tell it to do what you want it to do
		System.out.println(squared.compute(6,5));

		intCalculator divide = (a,b) -> a/b;
		System.out.println(divide.compute(50,2));

		intCalculator add=(a,b) -> a+b;
		System.out.println(add.compute(12,35));

		intCalculator multiply = (a,b) -> a *b;
		System.out.println(multiply.compute(12,3));

		intCalculator lotsOfStuff = (a,b) -> {
			int i = a+b;
			int j = i*i;
			 return j;
		};

		System.out.println(lotsOfStuff.compute(10,3));

	}

}
