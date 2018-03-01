package p2;

public class Course {
	private String courseTitle;
	Student student;
	Faculty faculty;

	public Course(String courseTitle, Faculty faculty) {
		this.courseTitle = courseTitle;
		this.faculty=faculty;
	}
	public Course(String courseTitle, Student student) {
		this.courseTitle = courseTitle;
		this.student = student;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Course [courseTitle=" + courseTitle + ", student=" + student + ", faculty=" + faculty + "]";
	}

}
