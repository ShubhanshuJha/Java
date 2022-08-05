/*
The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.
Implement a program to determine the eligible loan amount and the EMI that the bank can provide to its customers based on their salary and
the loan type they expect to avail. The values required for determining the eligible loan amount and the EMI are:
    account number of the customer
    account balance of the customer
    salary of the customer
    loan type
    expected loan amount
    expected no. of EMIs
The following validations should be performed:
    The account number should be of 4 digits and its first digit should be 1
    The customer should have a minimum balance of $1000 in the account
Display appropriate error messages if the validations fail.
If the validations pass, determine whether the bank would provide the loan or not.
The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer is less than or equal to the loan
amount and the number of EMIs decided by the bank respectively. The bank decides the eligible loan amount and the number of EMIs based on
the below table.
------------------------------------------------------------------------
Salary		|	Loan Type 	|	Eligible Loan Amount | No. Of EMIs
------------------------------------------------------------------------
>25000 		|  Car 			|  500000 				 | 36
------------------------------------------------------------------------
>50000 		|  House 		|  6000000 				 | 60
------------------------------------------------------------------------
>75000		|  Business		|  7500000 				 | 84
------------------------------------------------------------------------
Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.
Display an appropriate message if the bank does not provide the loan.
*/

import mypackages.io.*;
import java.io.*;

class LoanCalc__SelectionControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter account number: ");
		String accNumber = reader.readLine();
		writer.print("Enter salary: ");
		int salary = Integer.parseInt(reader.readLine());
		writer.print("Enter account balance: ");
		int accBalance = Integer.parseInt(reader.readLine());
		writer.print("Enter loan type: ");
		String loanType = reader.readLine();
		writer.print("Enter loan amount expected: ");
		int loanAmountExpected = Integer.parseInt(reader.readLine());
		writer.print("Enter EMIs expected: ");
		int emisExpected = Integer.parseInt(reader.readLine());

		if (accNumber.length() == 4 && accNumber.charAt(0) == '1' && accBalance >= 1000) {
			// writer.println("Valid Entry.");
			if (salary > 25000 && loanType.equalsIgnoreCase("Car") && loanAmountExpected <= 500000 && emisExpected <= 36) {
				writer.println("eligibleLoanAmount=" + 500000 + "\neligibleEMIs=" + 36);
			} else if (salary > 50000 && loanType.equalsIgnoreCase("House") && loanAmountExpected <= 6000000 && emisExpected <= 60) {
				writer.println("eligibleLoanAmount=" + 6000000 + "\neligibleEMIs=" + 60);
			} else if (salary > 75000 && loanType.equalsIgnoreCase("Business") && loanAmountExpected <= 7500000 && emisExpected <= 84) {
				writer.println("eligibleLoanAmount=" + 6000000 + "\neligibleEMIs=" + 60);
			} else {
				writer.println("You are not eligible for the loan.");
			}
		} else {
			if (accNumber.length() != 4 || accNumber.charAt(0) != '1')
				writer.println("Entry Validation Failed!!!");
			else
				writer.println("Your account must have at leat $1000 to get any loan.");
		}
	}
}