// Collatz Conjecture in Java

public class CollatzConjecture{
	public static void main(String[] args) {
		System.out.println("\n"+f(f(f(f(f(f(f(674))))))));
		System.out.print(f(f(f(f(f(f(f(f(f(f(f(f(f(f(1071)))))))))))))));
	}

	static int f(int n){
		if (n%2==0) {
			return n/2;
		}
		else{
			return 3*n+1;
		}
	}
}