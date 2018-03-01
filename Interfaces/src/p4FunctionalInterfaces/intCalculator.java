package p4FunctionalInterfaces;

public interface intCalculator {
	int compute(int number1, int number2);// you can have only one functional interface but
							// for the default methods you can have as many as
							// you want

	default int add(int number1, int number2) {
		return number1 + number2;
	}
}
