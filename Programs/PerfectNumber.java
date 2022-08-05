import java.lang.*;

class PerfectNumber{
	public static void main (String[] args){
		PerfectNumber pn = new PerfectNumber();
		for (int i = 1; i <= 1000; i++) {
			boolean result = pn.isPerfectNumber(i);
			if (result == true)
				System.out.println(i);
		}
	}

	public boolean isPerfectNumber(int number){
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				sum = sum + i;
		}

		if (sum == number)
        	return true;
 
    	return false;
	}
}