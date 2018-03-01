package binarySearch;

public class BinarySearch {

	public static int binarySearch(int[] list, int key) {// the array must be sorted
		
		int low =0;// the beginning of the array, lower bound
		int high=list.length-1;// the last element of the array, upper bound
		
		
		while(high>=low) {// while the high is greater than low we are not finished 
			
			int mid=(low+high)/2;// this is the middle of the array, thats why its the average of the high and low
			if(key<list[mid]) {// if the value of key is on the left side of the array abandon the whole right side
				high=mid-1;// this is the new midpoint because it has to search only on the left side
							
			}else if(key==list[mid]) {// the jack pot scenario if your mid contains the data you need
				return mid;				// this is what happens when you keep shrinking the array
			}else {// this is if the value your looking for is on the right side of the array
				low = mid+1;// this adjusts the midpoint so you only search on the right
			}
		}
		return -1;// this is because you didn't find anything

		
	}
		
}
