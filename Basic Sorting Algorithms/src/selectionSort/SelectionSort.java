package selectionSort;

public class SelectionSort {
	private int[] a;
	private int nElems;

	public SelectionSort(int maxSize) {

		a = new int[maxSize];
		nElems = 0;
	}

	public void insert(int newValue) {
		a[nElems++] = newValue;
	}

	public void display() {

		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + ", ");

		}
		System.out.println();
	}

	public void selectionSort() {
		int out;
		int in;
		int min;
		for (out = 0; out < nElems - 1; out++) {// outer loop
			min = out;// setting the out to the index for minimum value
			for (in = out; in < nElems; in++) {
				if (a[in] < a[min]) {

					min = in;
				}
			}
			swap(out, min);
		}
	}

	public void swap(int dex1, int dex2) {
		int temp = a[dex1];
		a[dex1] = a[dex2];
		a[dex2] = temp;
	}

}
