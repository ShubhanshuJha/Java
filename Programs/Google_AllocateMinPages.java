/*You are given N number of books. Every ith book has Ai number of pages. 
You have to allocate books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages.
Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is minimum of those in all the other permutations and print this minimum value.
Each book will be allocated to exactly one student. Each student has to be allocated at least one book.
Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).*/

// The books should be assigned to student consecutively.
import java.io.*;

public class Google_AllocateMinPages{
	// The total solution is done in, O(n)*O(log n) => O(n log n)
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		print("Enter the array: ");
		String[] input = br.readLine().split(" ");
		int size = input.length;
		int[] arr = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = Integer.parseInt(input[i]);

		print("The books are:");
		printArr(arr);
		println();

		print("Enter the number of students: ");
		int m = Integer.parseInt(br.readLine());

		long startTime = System.currentTimeMillis();
		// int result = minPages(arr, m);
		int result = minPages(arr, size, m);
		long endTime = System.currentTimeMillis();

		println("The req result is " + result);

		double time = (endTime - startTime) / 1000.0;
		print("Run time in seconds was: "+time);
	}
	static boolean isFeasible(int arr[], int n, int m, int curr_min){
        int studentsRequired = 1;
        int curr_sum = 0;
      
        // iterate over all books
        for (int i = 0; i < n; i++){
            // check if current number of pages are greater than curr_min that means we will
            // get the result after mid no. of pages
            if (arr[i] > curr_min)
                return false;
            // count how many students are required to distribute curr_min pages
            if (curr_sum + arr[i] > curr_min){
                // increment student count
                studentsRequired++;
                // update curr_sum
                curr_sum = arr[i];
                // if students required becomes greater than given no. of students,return false
                if (studentsRequired > m)
                    return false;
            }
            // else update curr_sum
            else
                curr_sum += arr[i];
        }
        return true;
    }
      
    // method to find minimum pages
    static int minPages(int arr[], int n, int m){
        long sum = 0;
        // return -1 if no. of books is less than no. of students
        if (n < m)
            return -1;
      
        // Count total number of pages
        for (int i = 0; i < n; i++)
            sum += arr[i];
        // initialize start as 0 pages and end as total pages
        int start = 0, end = (int) sum;
        int result = Integer.MAX_VALUE;
        // traverse until start <= end
        while (start <= end){
            // check if it is possible to distribute books by using mid is current minimum
            int mid = (start + end) / 2;
            if (isFeasible(arr, n, m, mid)){
                // update result to current distribution as it's the best we have found till now.
                result = mid;
                // as we are finding minimum and books are sorted so reduce end = mid -1 that means
                end = mid - 1;
            }
            else
                // if not possible means pages should be increased so update start = mid + 1
                start = mid + 1;
        }
        // at-last return minimum no. of  pages
        return result;
    }

// The code below is not correct for all test cases.
		// This is done in O(log n)
	// protected static int minPages(int[] a, int k){
	// 	int min = a[0], max = 0, result = 0;
	// 	for (int i=0; i<a.length; i++){
	// 		max += a[i];
	// 		if (min > a[i])
	// 			min = a[i];
	// 	}
	// 	while(min <= max){
	// 		int mid = ((min + max) >> 1);
	// 		if(isFeasible(a, k, mid)){
	// 			result = mid;
	// 			max = mid - 1;
	// 		}
	// 		else
	// 			min = mid + 1;
	// 	}
	// 	return Math.max(max, result);
	// }
		// This is done in O(n)
	// private static boolean isFeasible(int[] a, int k, int res){
	// 	int student = 1, sum = 0;
	// 	for(int i=0; i<a.length; i++){
	// 		if (sum + a[i] > res){
	// 			student++;
	// 			sum = a[i];
	// 		}
	// 		else{
	// 			sum += a[i];
	// 		}
	// 	}
	// 	return (student <= k);
	// }

	protected static void print(String s){
		System.out.print(s);
	}
	protected static void println(){
		System.out.println();
	}
	protected static void println(String s){
		System.out.println(s);
	}
	protected static void printArr(int[] arr){
		for (int i=0; i<arr.length; i++) {
			if (i % 100 == 0)
				println();
			print(arr[i]+" ");
		}
	}
}