package learningBinarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		int testingArray[] = {2,12,25,29,38,54,69,78,125,325,435,595,685,712,863,912,1032,1258};
		
		System.out.println(findNumber(testingArray,325));
		
		
	}
	
	
	// the array must be sorted
	
	public static int findNumber(int tempArray[], int findMe) {
		int a = 0;
		int b =tempArray.length-1;
		while(a<=b) {
			int c = (a+b)/2;
				if(findMe<tempArray[c]) {
					b = c-1;
				}else if(findMe>tempArray[c]){
					a = c+1;
			}else {
				return c;
			}
				
		}return -1;
		
	}

}
