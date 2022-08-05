import java.util.*;

public class LinearVsBinarySearch{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		byte arr[] = new byte[101];
		// arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (byte i = 0; i < 101; i++) {
			arr[i] = i;
		}

		System.out.print("Enter the number you want to search: ");
		byte n = sc.nextByte();

		System.out.print("\nPress 1 to perform Linear Search and 2 to perform Binary Search: ");
		byte choice = sc.nextByte();
		byte len = (byte) arr.length;

		if (choice == 1)
			linearSearch(arr,n);
		else if(choice == 2)
			binarySearch(arr,n,len,(byte)0);
		else
			System.out.println("Wrong input!!!");
	}

	public static void linearSearch(byte ar[], byte x){
		for (byte i = 0; i < ar.length; i++) {
			if (ar[i] == x) {
				System.out.println("Element "+x+" found at index "+i+".");
				return;
			}
		}
		System.out.println("Element not found.");
	}

	public static void binarySearch(byte ar[], byte x, byte ub, byte lb){
		byte mid = (byte) (lb + (ub - lb) / 2);
		if (x == ar[mid]) {
			System.out.println("Element "+x+" found at index "+mid+".");
			return;
		}
		else if (x > ar[mid]) {
			mid++;
			binarySearch(ar,x,ub,mid);
		}
		else{
			binarySearch(ar,x,mid,lb);
		}
	}
}