package learningSelectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		int unsortedArray[] = {25,36,95,28,45,125,02,999,78,19,325,769,652,854};
		
		int sortedArray[] = selectionSort(unsortedArray);
		
		System.out.println(Arrays.toString(sortedArray));
	}
	
	public static int[] selectionSort(int tempArray[]) {

		for(int i =0;i<tempArray.length;i++) {
			int minimumNumber = i;
			for(int j = i+1; j<tempArray.length;j++) {
				if(tempArray[j]<tempArray[minimumNumber]) {// if we find a smaller value do this
					minimumNumber=j;
					
				}
			}
			int temp = tempArray[i];
			tempArray[i] = tempArray[minimumNumber];
			tempArray[minimumNumber]= temp;
			
		}
		return tempArray;
	}
	
	

}















