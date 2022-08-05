import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
// super keyword is used to call constructor of parent class
// super.methodOfParentClass()

class Student extends Person{
	private int[] testScores;
    Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName,lastName,id);
        this.testScores=testScores;
    }
    char calculate(){
        int Total=0;
        for(int testScores:testScores){
            Total=Total+testScores;
        }
        int avg=Total/testScores.length;
        if (avg >= 90 && avg <= 100) return 'O';
        if (avg >= 80 && avg < 90) return 'E';
        if (avg >= 70 && avg < 80) return 'A';
        if (avg >= 55 && avg < 70) return 'P';
        if (avg >= 40 && avg < 55) return 'D';
        return 'T';
    }
}
public class InheritanceExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstName = scan.next();
		System.out.println("Enter the last name:");
		String lastName = scan.next();
		System.out.println("Enter the ID:");
		int id = scan.nextInt();
		System.out.println("Enter the number of subjects:");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			System.out.println("Enter the "+(i+1)+ " marks: ");
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}