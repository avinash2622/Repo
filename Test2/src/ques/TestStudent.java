package ques;

public class TestStudent {

	public static void main(String[] args) {
		
		Student bob = new Student();
		Student jian = new Student();
		
		bob.name="BOB";
		bob.age=19;
		
		jian=bob;
		jian.name="JIAN";
		
		System.out.println("Bob's Name : " + bob.name );
	}

}
