package genericInterfaces;

public class GenericSearch {

	public static <E extends Comparable<E>>int sequentialSearch(E[] array , E value){// in the method the E is a place holder
				// but you have to extend the comparable class because in order to search or sort you need data types that 
				// are comparable, the comparable is a actual java interface that you can use and itself is generic
				// so you can extends but because its a generic interface you can use extends because extends means 
				// something else when used with generic. so our generic method constrains everything to things that 
				// can be searched with the comparable interface a lot of stuff can be compared, almost anything that
				// can be compared is included in the comparable interface the int is the return data type so it dosen't
				// matter what you are comparing because the you are returning the index in the array so thats why 
				// you declare the return type as an int
	int index=0;
	int position=-1;
	boolean found=false;
	
	while(!found && index<array.length) {
			if(array[index].compareTo(value)==0) {
				found=true;
				position = index;
			}
			index++;
	}
	return position;
	}
		
}
