package duckExample;

public class Duck {
	private String name;
	private String id;
	private static int idCounter = 0;
	public Duck(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", id=" + id + "]";
	}

}
