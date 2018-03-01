package string;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		int length = str1.length();

		char c1 = str1.charAt(0);
		System.out.println(c1);// use to see whats stored at a certain location

		String str2 = str1.substring(1, 4);// prints certain info from one
											// location to another if wanted
											// to go to end of string only put
											// the starting index
		System.out.println(str2);

		int index = str1.indexOf("l");// finds the first instance of the letter
		System.out.println(index);

		String name = "John, A., Doe, 4.0, 12574854, 221, 596";
		// int locationOfDot = name.indexOf(".");
		char middleInitial = name.charAt(name.indexOf(".") - 1);// finding the
																// middle
																// initial
		System.out.println(middleInitial);

		char[] chars = name.toCharArray();
		System.out.println(chars[6]);
		for (int i = 0; i < chars.length; i++) {
			System.out.println("\t" + chars[i]);
		}

		/*for (char c : chars) {
			System.out.println("\t" + "\t" + c);

		}
*/
		String[] tokens = name.split("[,; ]");// to split a string, the square bracket means either one

		tokens[1] = String.valueOf(tokens[1].charAt(0));

		for(String s : tokens){
			System.out.println(s);
		}
		double gpa = Double.parseDouble(tokens[4]);
		int id = Integer.parseInt(tokens[4]);


		/*
		 * String id = String.valueOf(10000);
		 *
		 * double answer = Calculator.add(1, 4); System.out.println(answer);
		 *
		 * answer = Calculator.subtract(1, 4); System.out.println(answer);
		 *
		 * answer = Calculator.multiply(1, 4); System.out.println(answer);
		 *
		 * answer = Calculator.divide(1, 4); System.out.println(answer);
		 */
	}

}
