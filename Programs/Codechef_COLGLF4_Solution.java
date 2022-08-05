/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_COLGLF4_Solution{
	public static long solve(long n, long e, long h, long a, long  b, long c){
        //long ans =  Integer.MAX_VALUE;
        long ans = (long)1e15;
        if(n<=0){
            return 0;
        }
        if(n<=e && n<=h){
    		ans = Math.min(ans,n*c);
    	}
    	if(2*n <= e){
        	ans = Math.min(ans,n*a);
    	}
    	if(3*n <= h ){
        	ans  = Math.min(ans, n*b);
    	}
    	if((h-n)/2 >= 1 && (h-n)/2 >= n-e){
        	if(b-c<0){
            	long x = Math.min(n-1,(h-n)/2);
            	ans  = Math.min(ans,(b-c)*x+n*c);
        	}
        	else{
           		long x = Math.max(1,(n-e));
            	ans = Math.min(ans,(b-c)*x+n*c);
        	}
    	}

    	if((e-n)>=1 && (e-n)>=n-h){
        	if(a-c<0){
            	long x = Math.min(n-1,(e-n));
            	ans = Math.min(ans,(a-c)*x+n*c);
        	}
        	else{
            	long x = Math.max(1,(n-h));
            	ans = Math.min(ans,(a-c)*x+n*c);
        	}
    	}

    	if(e/2 >= 1 && e/2>=(3*n-h+2)/3){
        	if(a-b<0){
            	long x = Math.min(n-1,(e/2));
            	ans = Math.min(ans,(a-b)*x+n*b);
        	}
        	else{
            	long x = Math.max(1,((3*n-h+2)/3));
            	ans = Math.min(ans,(a-b)*x+n*b);
        	}
    	}

    	if(e>=3 && h>=4 && n>=3){
        	ans = Math.min(ans,a+b+c+solve(n-3,e-3,h-4,a,b,c));
    	}
    	return ans;
    }

	public static void main (String[] args) throws java.lang.Exception{
		Scanner  s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    long n = s.nextLong();
		    long e = s.nextLong();
		    long h = s.nextLong();
		    long a = s.nextLong();
		    long b = s.nextLong();
		    long c = s.nextLong();
		    long result = solve(n,e,h,a,b,c);
		    if(result ==  (long)1e15){
		        System.out.println("-1");
		    }
		    else{
		        System.out.println(result);
		    }
		}
	}
}