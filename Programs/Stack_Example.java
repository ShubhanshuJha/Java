import java.util.Stack;
import java.util.List;
import java.util.Scanner;

public class Stack_Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		System.out.println("Enter the value:");
		int n = sc.nextInt();

		// stack.push(11);
		// stack.push(13);
		// stack.push(15);
		// stack.push(17);
		// stack.push(19);

		// Inserting Odd num. upto n in Stack
		for (int i = 1; i <= n; i = i + 2) {
			if (i > n)
				continue;
			stack.push(i);
		}
		System.out.println("Current elements of Stack:\n"+stack);
		// We can't pop item from an empty Stack, that will give
		// EmptyStackException
		System.out.println("Popped elements is: "+stack.pop());
		// System.out.println("Current elements of Stack:\n"+stack);
		System.out.println("Top element of Stack is(Peek): "+stack.peek());
		// System.out.println("Current elements of Stack:\n"+stack);
	}
}