package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		Stock[] stocks = new Stock[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Please enter the stock symbol");
			String symbol = userInput.nextLine();
			System.out.println("Please enter the stock name");
			String name = userInput.nextLine();
			System.out.println("Please enter the stock price");
			double price = userInput.nextDouble();
			userInput.nextLine();
			stocks[i] = new Stock(symbol, name, price);

		}
		for (int i = 0; i < 2; i++) {
			System.out.println(stocks[i]);
		}
	}

}
