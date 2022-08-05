// Java program to implement various sorting techniques
// 1. Comparable Objects	2. Comparator Objects
// 3. Anonymous Comparator Classes
// 4. Comparator.comparing() -> thenComparing() -> reverseOrder()
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ComparableInterface_Example{
	public static void main(String[] args){
		List<Student> students = new ArrayList<>();
		students.add(new Student(12, "Ram"));
		students.add(new Student(5, "Aman"));
		students.add(new Student(34, "Mohan"));
		students.add(new Student(15, "Rohit"));
		students.add(new Student(5, "Mohit"));
		students.add(new Student(90, "Shyam"));
		students.add(new Student(55, "Aman"));
		students.add(new Student(25, "Mohit"));
		// System.out.println(students);
		// Printing the elements of students List using Lambda function
		students.forEach(System.out::println); //This optimizes the code
		// To sort this Collection, the Student class here must be
		// implementing Comparable interface
		System.out.println("\nAfter using Collections.sort() method:");
		//This needs a list/array whose items should have implemented Comparable interface
		Collections.sort(students);
		students.forEach(System.out::println);

		// System.out.println("\nAfter sorting the Collection using Comparator:");
		// // Collections.sort(students, new SortByNameThenMarks_UsingComparator());
		// // Alternate way
		// Collections.sort(students, new Comparator<Student>() {
		// 	@Override
		// 	public int compare(Student obj1, Student obj2){
		// 		if (obj1.name.equals(obj2.name)) {
		// 			// This line is same as we did in compareTo() method above
		// 			return obj1.marks - obj2.marks;
		// 		}
		// 		else{
		// 			return obj1.name.compareTo(obj2.name);
		// 		}
		// 	}
		// });
		// students.forEach(System.out::println);
		System.out.println("\nImplementing Comparator using Lambda expression:");
		// After Java 8, Lambda gets introduced which can reduce the snippet like this
		// If any interface has only one fn(), then writing fn() name isn't neccessary
		Collections.sort(students,(obj1, obj2) ->{ //We know these are of Student class (same), so removed it
				if (obj1.name.equals(obj2.name))
					return obj1.marks - obj2.marks;
				else
					return obj1.name.compareTo(obj2.name);
			});
		students.forEach(System.out::println);
		System.out.println("\nSorting via other different methods:");
		// If I've to sort the students list w.r.t. to name only, then we can simply write the code like this
		Collections.sort(students,(obj1, obj2) -> obj1.name.compareTo(obj2.name));
		// If we want the same function as we get from SortByNameThenMarks_UsingComparator, then
		// We can do it simply by writing like this
		Collections.sort(students, Comparator.comparing(Student :: getName).thenComparing(Student :: getMarks));
		students.forEach(System.out::println);
		System.out.println("\nDisplaying the above implemetation in reversed order:");
		// If we want the same function as we get from SortByNameThenMarks_UsingComparator, but want the sorting in
		// the reversed order. Then, we can do it simply by writing .reverse() method like this:
		Collections.sort(students, Comparator.comparing(Student :: getName).thenComparing(Student :: getMarks).reversed());
		students.forEach(System.out::println);
	}
}
// This class is imp Comparable
class Student implements Comparable<Student>{
// class Student{
	int marks;
	String name;

	public Student(int marks, String name){
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString(){
		return "Student [marks = " + marks + ", name = "+ name + "]";
	}
	
	public int getMarks(){
		return marks;
	}
	
	public void setMarks(int marks){
		this.marks = marks;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Student obj){
		// Making conditions for comparing the currObject & givenObject
		// This type of return w.r.t. the condition, performs sorting in Descending Order
		// if (this.marks > obj.marks) return -1;
		// else if (this.marks < obj.marks) return 1;

		// This type of return w.r.t. the condition, performs sorting in Ascending Order
		if (this.marks > obj.marks) return 1;
		else if (this.marks < obj.marks) return -1;
		return 0;
		// This to be done, when the marks are equal, & then, we want to perform
		// sorting as per Object's name.
		// return this.name.compareTo(obj.name);
	}
}
// This can be avoided by imple the same in Collections.sort(list, Comparator<>(){
// 	...here...
// })
// class SortByNameThenMarks_UsingComparator implements Comparator<Student>{
// 	@Override
	// public int compare(Student obj1, Student obj2){
	// 	if (obj1.name.equals(obj2.name)) {
	// 		// This line is same as we did in compareTo() method above
	// 		return obj1.marks - obj2.marks;
	// 	}
	// 	else{
	// 		return obj1.name.compareTo(obj2.name);
	// 	}
	// }
// }