import java.util.Scanner;

public class DoTempProg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		double prevResult = 0.00, currResult = 0.00, a, b;
		while(bool){
			System.out.println("Want to use previous result (Y/N):");
			char choice = sc.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.println("Want to do calc for previous two outputs (Y/N):");
				char ch = sc.next().charAt(0);
				if (ch == 'Y' || ch == 'y') {
					a = prevResult;
					b = currResult;
				}
				else{
					a = prevResult;
					System.out.println("Previous result = "+prevResult+"\nEnter the second value for operation:");
					b = sc.nextDouble();
				}
			}
			else{
				System.out.println("Enter two values:");
				a = sc.nextDouble();
				b = sc.nextDouble();
			}
			System.out.println("Enter the operation:");
			char op = sc.next().charAt(0);
			switch(op){
				case '+':
					currResult = a+b;
					System.out.println(a+b);
					break;
				case '-':
					currResult = a-b;
					System.out.println(a-b);
					break;
				case '*':
					currResult = a*b;
					System.out.println(a*b);
					break;
				case '/':
					currResult = a/b;
					System.out.println(a/b);
					break;
				case '%':
					currResult = a%b;
					System.out.println(a%b);
					break;
				case 'c':
					bool = false;
					break;
				default:
					System.out.println("Wrong Input!!!");
			}
			prevResult = currResult;
		}
	}
}