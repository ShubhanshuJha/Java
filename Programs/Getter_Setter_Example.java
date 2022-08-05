public class Getter_Setter_Example{
	public static void main(String[] a){
		Student student = new Student();

		// student.name = "Sam";
		student.set("Sam");
		System.out.println("Student's name: "+student.get());
	}
}

class Student{
   	public String name;
   	// Getter
   	public String get() {
      return name;
   	}
   	// Setter
   	public void set(String name) {
      this.name = name;
   	}
}