import java.util.*;
class AlphabeticaSortingTrick{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.next();
		}

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.printf("Alphabetic ascending ordered arr[] : \n%s\n\n",Arrays.toString(arr));

        // Sorts arr[] in descending order 
        Arrays.sort(arr, Collections.reverseOrder());
  
        System.out.printf("Alphabetic descending ordered arr[] : \n%s\n\n",Arrays.toString(arr));
	}
}