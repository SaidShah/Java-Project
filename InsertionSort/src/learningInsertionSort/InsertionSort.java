package learningInsertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		
		int unsortedArray[] = {25,36,95,28,45,125,02,999,78,19,325,769,652,854};
		
		int sortedArray[] = insertionSort(unsortedArray);
		
		System.out.println(Arrays.toString(sortedArray));
		
		
	}
	
	
	public static int[] insertionSort(int tempArray[]) {
		for(int i =1;i<tempArray.length;i++) {
			int element = tempArray[i];// element variable contains the data we intend on bringing to the sorted area
			int j = i-1;// j variable points to the index position 
				while(j>=0 && tempArray[j]>element) {
					tempArray[j+1] = tempArray[j];
					j--;
			}
				tempArray[j+1]=element;
				
		}
		return tempArray;
	}
	
	

}
