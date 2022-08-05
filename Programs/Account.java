// Generic class for Bank Account
public class Account<E>{
	E balance;
	public Account(E balance){
		this.balance = balance;
	}
	// public void credit(E balance){
	// 	super();
	// 	this.balance = this.balance + balance;
	// }
	public E balanceEnquiry(){
		return balance;
	}
}