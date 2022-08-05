/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
    public static void main (String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++){
                int n = sc.nextInt();
                String st[] = new String[n];
                for(int j = 0; j < n; j++){
                    st[j] = sc.next();
                }
                char ch[] = new char[n];
                int idx = 0;
                for (String s: st){
                    ch[idx] = s.charAt(0);
                    // s = s.substring(1,s.length());
                    // System.out.println(a);
                    idx++;
                }
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (j == n-1) {
                        if (ch[j] != ch[j-1]) {
                            count ++;
                        }
                        if (st[j].substring(1,st[j].length()) == st[j-1].substring(1,st[j-1].length())) {
                            count--;
                        }
                    }
                    else{
                        if (ch[j] != ch[j+1]) {
                            count ++;
                        }
                        if (st[j].substring(1,st[j].length()) == st[j+1].substring(1,st[j+1].length())) {
                            count--;
                        }
                    }
                }
                for (String s: st) {
                    
                }
                System.out.println(count);
            } 
            sc.close();
        }
        catch(java.lang.Throwable t) {
        }
    }
}
    // public static void main (String[] args) throws java.lang.Exception{
    // try {
    //         Scanner sc = new Scanner(System.in);
    //         int n = sc.nextInt();
    //         int a[]=new int[n];
    //         for(int i=0;i<n;i++) {
    //             a[i]=sc.nextInt();
    //         }
    //         int q = sc.nextInt();
    //         int b[]=new int[q];
    //         for(int i = 0; i < q; i++){
    //             b[i] = sc.nextInt();
    //         }
    //         for (int i = 0; i < q; i++) {
    //             int result = sumXOR2(a,b[i],n);
    //             System.out.println(result);
    //         }
    //         // sumSubsequences(a,n,b);
    //     }catch (Exception e) {
    //     }
    // }

    // static int sumXOR2(int arr[], int k, int n){
    //     if (n < k) {
    //         return 0;
    //     }
    //     int x[] = new int[n];
    //     int result = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (i > 0) {
    //             x[i] = x[i-1] ^ arr[i];
    //         }
    //         else{
    //             x[i] = arr[i];
    //         }
    //         if (i >= k-1) {
    //             int sum = 0;
    //             sum = x[i];
    //             if (i - k > -1) {
    //                 sum ^= x[i-k];
    //             }
    //             result += sum;
    //         }
    //     }
    //     return result;
    // }

    // static int nCr(int n, long r){ 
    //     return fact(n) / (fact(r) * fact(n - r));
    // }
    // static int fact(long n){ 
    //     int res = 1; 
    //     for (int i = 2; i <= n; i++) 
    //         res = res * i; 
    //     return res; 
    // }
    // static void sumSubsequences(long arr[], int n, long arr2[]){
    //     long sum = 0;
    //     for (int i = 0; i < n; i++){
    //     sum += arr[i];
    //     }
    //     long ans = 0;
    //     for (int i = 0; i < arr2.length; i++) {
    //         long kLengthSubSequence = nCr(n, arr2[i]);
    //         long prev = ans;
    //         ans = sum * ((arr2[i] * kLengthSubSequence) / n);
    //         if (prev > 0) {
    //             ans -= (prev-1);
    //             ans += prev;
    //         }
    //         System.out.println(ans);
    //     }
    // }  
// }