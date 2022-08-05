// GFG Problem: K largest elements
// Given an array of N positive integers, print k largest elements from the array.
import java.io.*;
import java.util.*;

public class K_Largest_Elem{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> list = ob.kLargest(arr, n, k);

            for(int i = 0; i<list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}

class Solution{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            if(i < k){
                p.add(arr[i]);
            }
            else{
                if(p.peek() < arr[i]){
                    p.remove();
                    p.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>(p);
        Collections.sort(res, Collections.reverseOrder());
        return res;
    }
}