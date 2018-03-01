package string;

public class Calculator {
	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtract(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiply(double n1, double n2) {
		return n1 * n2;
	}

	public static double divide(double n1, double n2) {
		if (n2 == 0.0) {
			System.out.println("the secont number cannot be a zero");
		}
		return n1 / n2;
	}
}
