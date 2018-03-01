package p4;

import p3.*;

public class Demo {

	public static void main(String[] args) {
		CourseBag cBag = new CourseBag(8);
		CourseBag studentBag = new CourseBag(6);
		Course c1 = new Course("Math Precalculus", new Faculty("mike", 25000));
		cBag.insertCourse(c1);
		Course c2 = new Course("english 101", new Student("Alex", 2.9));
		cBag.insertCourse(c2);
		studentBag.insertStudent(c2);
		Course c3 = new Course("Database", new Faculty("james", 35958));
		cBag.insertCourse(c3);
		Course c4 = new Course("Math ", new Faculty("peter", 21450));
		cBag.insertCourse(c4);
		Course c5 = new Course("communication", new Student("joe", 2.6));
		cBag.insertCourse(c5);
		studentBag.insertStudent(c5);
		Course c6 = new Course("science", new Faculty("carlos", 39958));
		cBag.insertCourse(c6);
		Course c7 = new Course("Nursing", new Student("william", 2.4));
		cBag.insertCourse(c7);
		studentBag.insertStudent(c7);
		Course c8 = new Course("Computers 101", new Student("jason", 3.9));
		cBag.insertCourse(c8);
		studentBag.insertStudent(c8);
		//cBag.display();
		studentBag.displayStudent();
		System.out.println();

		System.out.println();
		studentBag.displayStudent();
		
	}
}
