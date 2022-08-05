import java.util.Scanner;
 
public class solution_Often{   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int inputNumber = sc.nextInt();
         
        int[] digitCount = new int[10];
         
        while (inputNumber != 0) {
            int lastDigit = inputNumber % 10;
            digitCount[lastDigit]++;
            inputNumber = inputNumber / 10;
        }
        int max = digitCount[0];
        for (int i = 0; i < digitCount.length; i++){
            if(digitCount[i] != 0){
            	if (digitCount[i] > max) 
                	max = digitCount[i];
            }
        }
        for (int i = 0; i < digitCount.length; i++) {
        	if (digitCount[i] != 0) {
        		if (digitCount[i] == max) {
        			System.out.println(i);
        		}
        	}
        }
         
        sc.close();
    }
}