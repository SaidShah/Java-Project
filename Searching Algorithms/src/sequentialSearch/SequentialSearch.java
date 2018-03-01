package sequentialSearch;

public class SequentialSearch {

	
		public static int sequentialSearch(int[] array, int value) {
			
			int index=0;// index this is the starting of the array
			int element=-1;// this is the element where the value is found
			boolean found = false;// false by default 
			
			while(!found && index<array.length) {
				if(array[index]==value) {
					found=true;
					element=index;
				}
				index++;
			}
			return element;
			
			
		}
}
