package polymorphism;

public class Pet {
	private String name;

	public Pet(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show(Pet pet){
		System.out.println(pet);
	}

	public void display(){
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
}
