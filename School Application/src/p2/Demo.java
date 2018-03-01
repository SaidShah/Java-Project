package p2;

public class Demo {
	public static void main(String[] args) {

		Course[] courseArray2 = new Course[6];
	
		
		 courseArray2[0]= new Course("Computer Science",new Student("john", 3.5));
		 courseArray2[1]= new Course("Math Precalculus", new Faculty("mike", 25000));
		 courseArray2[2]= new Course("english 101", new Student("Alex", 2.9));
		 courseArray2[3]= new Course("Database", new Faculty("james", 35958));
		 courseArray2[4]= new Course("Economics", new Student("jose", 3.8));
		 courseArray2[5]= new Course("Drawing 101", new Faculty("Peter", 65000));

		courseArray2[1].getFaculty().setName("john doe");
		for(int i = 0; i < 6  ; i++) {
				System.out.println(courseArray2[i]);
			
		
		}
	}
}
