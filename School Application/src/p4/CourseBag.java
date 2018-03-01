package p4;


import p3.*;

public class CourseBag {
	private Course[] courseArray;
	private int numOfElements;
	private Course[] studentArray = new Course[4];
	private int numOfStudents=4;
	
	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		numOfElements = 0;
		numOfStudents = 0;
	}

	public void insertCourse(Course course) {
		courseArray[numOfElements++] = course;
	}
	
	public void insertStudent(Course course) {
		studentArray[numOfStudents++]=course;
	}

	public void display() {
		for (int i = 0; i < numOfElements; i++) {
			System.out.println(courseArray[i]);
		}
		
	}
	public void displayStudent(){
		for(int i = 0; i < numOfStudents;i++) {
			System.out.println(studentArray[i]);
		}
	}


}
