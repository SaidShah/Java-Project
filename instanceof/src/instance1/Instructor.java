package instance1;

public class Instructor extends Person {
	
	private double salary;
	
	public Instructor(String name, String id, double salary) {
		super(name, id);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Instructor [" + super.toString() + ", salary=" + salary + "]";
	}

	
	
}
