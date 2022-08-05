// Sample format of the class required
// public class Generics_Pair_Class<String, Integer>{
// 	String x;
// 	int y;
// 	public Generics_Pair_Class(String x, int y){
// 		this.x = x;
// 		this.y = y;
// 	}
// }
public class Generics_Pair_Class<X, Y>{
	X x;
	Y y;
	public Generics_Pair_Class(X x, Y y){
		this.x = x;
		this.y = y;
	}
	public void displayPair(){
		System.out.println(x+" : "+y);
	}
}