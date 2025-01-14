package javaprogram;

public class firstpro {
	int rollno;
	int age;
	public void display1()
	{
		System.out.println("welcome to all of you....!");
	}
	public void display2()
	{
		System.out.println("automation is very easy....!");
	}
	public static void main(String[] args) {
		firstpro student =new firstpro();
		student.display1();
		student.display2();
		student.rollno=05;
		student.age=28;
		System.out.println( "pooja's roll number is:" +student.rollno);
		System.out.println("pooja's age is:" +student.age);
		
	
		
		
	}

}
