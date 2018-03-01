package polymorphism;

public class Dog extends Pet {
	private String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [Name()=" + getName() + ", breed=" + breed + "]";
	}

}
