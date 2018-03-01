package learningLinearSearch;


public class LinearSearch {
	public static void main(String[] args) {
		
		
		int testingArray[] = {2,5,64,75,45,875,7,258,36,98,40};
		
		System.out.println(findIt(testingArray,258));
		
	}
	
	
	public static int findIt(int tempArray[],int x) {
		for(int i =0;i<tempArray.length;i++) {
			if(tempArray[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
