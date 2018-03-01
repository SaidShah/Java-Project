package polymorphism;

public class Cat extends Pet {
	private int age;

	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [Name()= " + getName() + ", age= " + age + "]";
	}

}
