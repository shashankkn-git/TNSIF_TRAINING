package org.tnsif.acc.c2tc.oops;
class Course
{
	String courseName="Java Programmming"; //instance var
	void showCourse()
	{
		System.out.println("Course :"+courseName);
	}
}
//sub class
class Student extends Course 
{
	String name="Ganguuu";
	
	void showStudent()
	{
		System.out.println("Student : "+name);
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.showCourse();
		student.showStudent();
	}
}
