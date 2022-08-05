// import java.util.Scanner;

public class FinalKeyword_Use{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		FinalKeyword fk = new FinalKeyword();
		System.out.println();
		// When name & roll is not assigned
		Student obj1 = new Student();
		Student obj2 = new Student();
		System.out.println();
		// When name & roll is assigned
		final Student obj3 = new Student();
		obj3.name = "Alpha"; obj3.rollNo = 101;
		Student obj4 = new Student();
		obj4 = obj3;
		System.out.println();
		// Displaying elements separately
		System.out.println("Object3 details:\nName: "+obj3.name+
			"\nRoll: "+obj3.rollNo);
		System.out.println("\nObject4 details:\nName: "+obj4.name+
			"\nRoll: "+obj4.rollNo);
	}
}

class FinalKeyword{
	final int rollNo;
	static final String studentName;
	final String univerRoll;
	{
		rollNo = 30;
	}
	
	static{
		studentName = "Shubhanshu Jha";
	}

	// FinalKeyword(){
	// 	univerRoll = "14800219037";
	// }

	FinalKeyword(){
		univerRoll = "14800219037";
		System.out.println("Name: "+studentName+"\nClass Roll: "+rollNo);
		System.out.println("University Roll: "+univerRoll);
	}
}

class Student{
	String name;
	int rollNo;
	Student(){
		System.out.println("Name: "+name+"\nRoll: "+rollNo);
	}
}