package p3;



public class Student {
	private String name;
	private String id;
	private double gpa;

	private static int idNumber = 0;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		final int ID_LENGTH = 5;

		id = String.valueOf(idNumber++);

		for (int i = ID_LENGTH; i > String.valueOf(idNumber).length(); i--) {
			id = '0' + id;
		}
		id = 'S' + id;
	}
	public Student(Student student){
		this(student.name,student.gpa);
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa +"]";
	}

}
