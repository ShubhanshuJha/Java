/*   Ludo Game  */
import java.util.Scanner;
import java.util.Random;


public class Ludo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdNum = new Random();
		int a=1;
		int arr[] = new int[100];
		for (int i=0; i<100; i++) {
			int rd = rdNum.nextInt(6)+1;
			arr[i] = rd;
		}
		for (int i=0; i<100; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n"+arr[i]+" occured ->"+count+" times");
		distinctValueCounter(arr, 100);
	}
	public static void distinctValueCounter(int a[], int size){
   		int i, j, count = 1;
   		for (i = 1; i < size; i++){
      		for (j = 0; j < i; j++){
         		if (a[i] == a[j]){
           			break;
         		}
      		}
      		if (i == j){
        		count++;
      		}
  		}
   		countFreqOfElement(a, size);
	}
	// public static void countFreqOfElement(int arr[], int n){ 
 //    	int visited[] = new int[100];
 //    	for (int i = 0; i < n; i++) { 
 //        	if (visited[i] == true)
 //            	continue;
 //        	int count = 1;
 //        	for (int j = i + 1; j < n; j++) {
 //            	if (arr[i] == arr[j]) {
 //                	visited[j] = true;
 //                	count++;
 //            	}
 //        	}
 //        	System.out.println("\n"+arr[i]+" occured ->"+count+" times"); 
 //   		}
	// } 
}
// public class Ludo{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		Random rdNum = new Random();
// 		int a=1;
// 		while (a==1) {
// 			int rd = rdNum.nextInt(6)+1;
// 			if (rd == 0) {
// 				System.out.println(rd+1);
// 			}
// 			else
// 				System.out.println(rd);
// 			a=sc.nextInt();
// 		}
// 	}
// }