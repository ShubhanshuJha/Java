import java.util.*;

public class SubArrayOfLength_L{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		// print("Enter the size of array: ");
		int size = sc.nextInt();
		// print("Enter the len of sub-array: ");
		int lenOfSubArr = sc.nextInt();
		int[] a = new int[size];
		// print("Enter the values of array:\n");
		for (int i=0; i<size; i++)
			a[i] = sc.nextInt();
		for(int i=0; i<size; i++){
			for(int j=i; j<i+lenOfSubArr && (i+lenOfSubArr-1)<size; j++){
				print(a[j]+" ");
			}
			if((i+lenOfSubArr-1)<size)
				print("\n");
		}
	}
	static void print(String s){
		System.out.print(s);
	}
}