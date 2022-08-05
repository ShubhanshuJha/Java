class solution_Perfect{
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (isPerfect(i)) {
				System.out.print(i+" ");
			}
		}
	}
	static boolean isPerfect(int n){
    	int sum = 1;
    	for (int i = 2; i * i <= n; i++){ 
        	if (n % i==0) { 
            	if(i * i != n)
                	sum = sum + i + n / i; 
            	else
                	sum = sum + i; 
        	} 
    	}  
    	if (sum == n && n != 1) {
    		return true; 
    	}
    	return false; 
	}
}