// Main class for Bank Account
import java.util.*;

public class AccountTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		print("Enter the amount: ");
		int amount = sc.nextInt();
		Account<Integer> account=new Account<>(amount);
		print("Current balance: "+
			account.balanceEnquiry()+"\n");
		print("Enter balance to deposit: ");
		int deposit = sc.nextInt();
		// account.credit(deposit);
		print("Current balance: "+
			account.balanceEnquiry()+"\n");
	}
	private static void print(String s){
		System.out.print(s);
	}
}