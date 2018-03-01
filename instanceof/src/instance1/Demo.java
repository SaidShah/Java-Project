package instance1;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("Joe", "1");
		Student s1 = new Student("John", "2", 4.0);
		Instructor i1 = new Instructor("Sally", "3", 12345);
		
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Student);
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof Person);

		Person[] a = new Person[3];
		a[0] = p1;
		a[1] = s1;
		a[2] = i1;
		
		for (Person b : a) {
			if (b instanceof Student) 
				System.out.println(b);
			else if (b instanceof Instructor) 
				System.out.println(b);
			else if (b instanceof Person) 
				System.out.println(b);
		}
		
//		
		if (p1.getClass().equals(String.class)) {
			System.out.println("Person is a person");
		} 
//		
		if (i1.getClass().equals(Instructor.class)) {
			System.out.println("i1 is an instructor");
		}  
		
		if (i1.getClass().equals(Person.class)) {
			System.out.println("i1 is a person");
		}  

	}

}
