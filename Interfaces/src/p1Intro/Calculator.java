package p1Intro;

public class Calculator implements intCalculator {

	@Override
	public int calculate(int number) {
		return number * number;
	}

	@Override
	public int compute(int num1, int num2) {
		return num1*num2;
	}
}
