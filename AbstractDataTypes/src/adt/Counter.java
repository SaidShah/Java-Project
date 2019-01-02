package adt;

public class Counter {

	private int value = 0;
	private String name=null;

	public Counter(String str) {
		this.name = str;
	}
	

	public void increment() {
		 value++;
	}

	public int getCurrentValue() {
		return value;

	}

	@Override
	public String toString() {
		return "Counter [value=" + value + ", name=" + name + "]";
	}

}
