package p2AnonymusClass;

public class Demo {

	public static void main(String[] args) {
		intCalculator c1 = new intCalculator() {

			@Override
			public int calculate(int number) {
				return number * number;
			}

			@Override
			public int compute(int num1, int num2) {
				return num1 * num2;
			}

		};   // you can create a concrete class without a name behind the scenes by
			// using the curly brackets and its called an anonymous class

	System.out.println(c1.calculate(7));
	System.out.println(c1.compute(2,10));
	}

}
