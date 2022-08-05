// import java.util.Scanner;

class Professor{
	//Declare data types / variables to be used via this class
	String name, subject;
	int age, experience;
	public void	details(){
		System.out.println("Professor "+name+" teaches "+subject+".");
		System.out.println("He is "+age+" years old, and has an experience of "+experience+" years.");
	}
}

class Student{
	String name, collegeName, streamName;
	int age;
	String address;
	public void basicDetails(){
		System.out.println(name+" is "+age+" years old.");
	}
	public void fullDetails(){
		System.out.println(name+" is "+age+" years old.");
		System.out.println("He studies in "+collegeName+" with "+streamName+" stream.");
	}
}

public class ClassExample{

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		// ClassName objectName = new ClassName();
		Professor p1 = new Professor();
		Professor p2 = new Professor();

		// Details for first object "p1"
		p1.name = "Tom";
		p1.age = 34;
		p1.subject = "English";
		p1.experience = 5;

		// Details for second object "p2"
		p2.name = "Jerry";
		p2.age = 30;
		p2.subject = "Physics";
		p2.experience = 3;

		// Calling a function "details()" for the first object "p1"
		p1.details();
		// Calling a function "details()" for the second object "p2"
		p2.details();

		System.out.println();

		//Now, do something with the second class "Student"
		Student s1 = new Student(); //From here a new object "s1" is created, having the characteristics of "Student" class

		s1.name = "Peter Parker";
		s1.age = 20;
		s1.collegeName = "University of California";
		s1.streamName = "Computer Science";

		System.out.println("Displaying the basic and full details of the student:");
		s1.basicDetails();
		System.out.println();
		s1.fullDetails();
	}
}