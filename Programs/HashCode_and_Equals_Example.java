import java.io.*;
import java.util.Set;
import java.util.HashSet;

public class HashCode_and_Equals_Example{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// Making two Objects of Pen of same characteristics
		Pen pen1 = new Pen(10, "Black");
		Pen pen2 = new Pen(10, "Black");
		// System.out.println(pen1);
		// System.out.println(pen2);

		// These both approach gives result as false, because the Objects are stored into
		// different locations in the memory.
		// System.out.println(pen1 == pen2);
		// System.out.println(pen1.equals(pen2));

		// After Overriding the .equals() method, we get the approp. result
		System.out.println(pen1.equals(pen2)); //This will show right result.
		Set<Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		// Before Overriding hashCode(), the pens set will be having both Objects treating them as different,
		// even though they are same because they are in different memory locations.
		System.out.println(pens);
		//After Overriding hashCode(), the same objects will show the any of one memory location.
	}
}
class Pen{
	int price;
	String color;
	public Pen(int price, String color){
		this.price = price;
		this.color = color;
	}
	// This willn't be efficient if dealing with Set. So, we do need to Override hashCode as well
	// to get the appropriate working.
	// The Overriden methods are not much efficient because they won't handle the edge cases.
	// Like when null or object of another class will be given.
	@Override
	public boolean equals(Object obj){
		Pen that = (Pen) obj;
		boolean isEqual = this.price == that.price
				&& this.color.equals(that.color);
		return isEqual;
	}
	@Override
	public int hashCode(){
		return price+color.hashCode();
	}
}