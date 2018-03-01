package p3;



public class Faculty{
	private String name;
	private String id;
	private double salary;

	private static int idNumber = 0;

	public Faculty(String name, double salary) {

		this.name = name;
		this.salary = salary;

		final int ID_LENGTH = 5;
		id = String.valueOf(idNumber++);

		for (int i = ID_LENGTH; i > String.valueOf(idNumber).length(); i--) {
			id = '0' + id;
		}
		id = 'F' + id;
	}

	public Faculty(Faculty faculty){
		this(faculty.name,faculty.salary);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", id=" + id + ", salary=" + salary +"]";
	}

}

