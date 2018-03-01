package selectionSort;

public class Demo {

	public static void main(String[] args) {
		
		SelectionSort sorter = new SelectionSort(15);
		sorter.insert(25);
		sorter.insert(1);
		sorter.insert(125);
		sorter.insert(20);
		sorter.insert(98);
		sorter.insert(1245);
		sorter.insert(854);
		sorter.insert(325);
		sorter.insert(0);
		sorter.display();
		long startTime = System.nanoTime();
		sorter.selectionSort();
		System.out.println("the total time is ");
		System.out.println(System.nanoTime()-startTime);
		sorter.display();
	}

}
