package p3;

public class Course {
	private String courseTitle;
	Student student;
	Faculty faculty;

	public Course(String courseTitle,Faculty faculty) {
		this.courseTitle = courseTitle;
		this.faculty = new Faculty(faculty);
	}

	public Course(String courseTitle,Student student) {
		this.courseTitle = courseTitle;
		this.student = new Student(student);
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return new Student(student);

	}

	public void setFaculty(Faculty faculty) {

		this.faculty = faculty;
	}

	public Faculty getFaculty() {

		return new Faculty(faculty);
	}

	@Override
	public String toString() {
		return "Course [courseTitle=" + courseTitle + ", student=" + student + ", faculty=" + faculty + "]";
	}

}
