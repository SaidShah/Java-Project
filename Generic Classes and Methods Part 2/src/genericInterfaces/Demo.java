package genericInterfaces;

public class Demo {

	public static void main(String[] args) {

			
		String[] names = {"john","adam","patty","michele"};
		System.out.println(GenericSearch.sequentialSearch(names, "patty"));
		
		Integer[] numbers = {2,23,52,1,26,584,85};
		System.out.println(GenericSearch.sequentialSearch(numbers, 26));
	}

}
