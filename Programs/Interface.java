// Java doesn't allows to extends multiple classes, means it doesn't allows to provide the behaviours of dfferent classes to one class using extends
// So, to overcome this, we use interface.
// We make multiple interfaces and then could implement in the required class

// Our class that needs those characteristics
// public class Interface{
// 	public static void main(String[] args) {
// 	}
// }

// We may think to extends Interface_AskedBehaviour_Class1 in our class
// public class Interface extends Interface_AskedBehaviour_Class1{
// 	public static void main(String[] args) {
// 	}
// 	@Override
// 	void giveDetails1(){
// 		System.out.println("This statements shows that characteristics of Interface_AskedBehaviour_Class1 has been extended to this class.");
// 	}
// }

// After writing extends there can be only one class name
// This is the rule.

// To overcome the scenario we have to convert those characteristic consisting classes to interfaces
// And then implement it here like shown below.
public class Interface implements Interface_AskedBehaviour_Class1, Interface_AskedBehaviour_Class2{
	public static void main(String[] args) {
		Interface interfaceChar = new Interface();
		// Here Interface class has both behaviours
		interfaceChar.giveDetails1();
		interfaceChar.giveDetails2();
	}
	@Override
	// we've to keep the methods public, otherwise, will give error
	public void giveDetails1(){
		System.out.println("This statements shows that characteristics of Interface_AskedBehaviour_Class1 has been extended to this class.");
	}

	@Override
	public void giveDetails2(){
		System.out.println("This statements shows that characteristics of Interface_AskedBehaviour_Class2 has been extended to this class.");
	}
}