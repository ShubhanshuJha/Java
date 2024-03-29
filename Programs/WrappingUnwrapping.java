// Java program to demonstrate use of wrapper 
// classes for radix conversion 

class WrappingUnwrapping 
{ 
	// Driver method 
	public static void main(String[] args) 
	{ 
		int a = 525; 
		long b = 12456545645L; 
		
		String binaryA = Integer.toString(a, 2); 
		System.out.println("Binary representation" + 
							" of A : " + binaryA); 
		String binaryB = Long.toString(b, 2); 
		System.out.println("Binary representation" + 
							" of B : " + binaryB);		 
		String octalA = Integer.toString(a, 8); 
		System.out.println("Octal representation" + 
								" of A : " + octalA); 
		String octalB = Long.toString(b, 8); 
		System.out.println("Octal representation" + 
								" of B : " + octalB);		 
	} 
} 


// // Java program to demonstrate Wrapping and UnWrapping 
// // in Java Classes
// import java.util.*;

// @SuppressWarnings("unchecked")
// class WrappingUnwrapping 
// { 
// 	public static void main(String args[]) 
// 	{ 
// 		// byte data type 
// 		byte a = 1; 

// 		// wrapping around Byte object 
// 		Byte byteobj = new Byte(a); 

// 		// int data type 
// 		int b = 10; 

// 		//wrapping around Integer object 
// 		Integer intobj = new Integer(b); 

// 		// float data type 
// 		float c = 18.6f; 

// 		// wrapping around Float object 
// 		Float floatobj = new Float(c); 

// 		// double data type 
// 		double d = 250.5; 

// 		// Wrapping around Double object 
// 		Double doubleobj = new Double(d); 

// 		// char data type 
// 		char e='a'; 

// 		// wrapping around Character object 
// 		Character charobj=e; 

// 		// printing the values from objects 
// 		System.out.println("Values of Wrapper objects (printing as objects)"); 
// 		System.out.println("Byte object byteobj: " + byteobj); 
// 		System.out.println("Integer object intobj: " + intobj); 
// 		System.out.println("Float object floatobj: " + floatobj); 
// 		System.out.println("Double object doubleobj: " + doubleobj); 
// 		System.out.println("Character object charobj: " + charobj); 

// 		// objects to data types (retrieving data types from objects) 
// 		// unwrapping objects to primitive data types 
// 		byte bv = byteobj; 
// 		int iv = intobj; 
// 		float fv = floatobj; 
// 		double dv = doubleobj; 
// 		char cv = charobj; 

// 		// printing the values from data types 
// 		System.out.println("Unwrapped values (printing as data types)"); 
// 		System.out.println("byte value, bv: " + bv); 
// 		System.out.println("int value, iv: " + iv); 
// 		System.out.println("float value, fv: " + fv); 
// 		System.out.println("double value, dv: " + dv); 
// 		System.out.println("char value, cv: " + cv); 
// 	} 
// } 
