import java.util.Scanner;
import java.util.ArrayList;

class Stack_Implementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();

		int newVal;
		do {
			System.out.print("\nEnter the data to push into the Stack > ");
			newVal = sc.nextInt();
			stack.push(newVal);

			System.out.print("\nWant to continue push() operation (1/0)? > ");
			newVal = sc.nextInt();
		} while (newVal == 1);
		
		newVal = 1;
		while (newVal == 1) {
			printOptions();
			newVal = sc.nextInt();
			switch (newVal) {
				case 1:
					System.out.print("\nEnter the data to push into the Stack > ");
					newVal = sc.nextInt();
					stack.push(newVal);
					newVal = 1;
					break;
				case 2:
					System.out.println(stack.pop() + " is popped out from the stack.");
					newVal = 1;
					break;
				case 3:
					System.out.printf("\n\n#Displaying the current Stack:\n\t");
					stack.display();
					newVal = 1;
					break;
				case 4:
					System.out.println("\nTop element of the Stack is: " + stack.peek());
					newVal = 1;
					break;
				case 5:
					newVal = 0;
					break;
				default:
					newVal = 1;
					System.out.println("Wrong Selection!");
			}
		}

		System.out.printf("\nProgram Finished.\n");
	}
	static void printOptions() {
		System.out.print("\nChoose the operation you want to perform on the stack:\n" + 
			"Enter 1 for push()\t2 for pop()\n3 for display() \t4 for peek()\n5 for exit() > ");
	}
}

class Stack {
	int N = 6;
	int top;

	int[] stack;
	
	void append(int[] stack1, int[] stack2, int n) {
		for (int i = 0; i < n; i++) {
			stack2[i] = stack1[i];
		}
	}
	void pushArr(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			push(arr[i]);
	}
	void popStack() {
		for (int i = 0; i < N && top >= 0; i++)
			System.out.print(pop() + "\t");
	}

	void capacity() {
		System.out.printf("\nCurrent capacity of the Stack is %d\n", N);
		return;
	}

	int[] newStack() {
		int[] new_stack = new int[N];
		// System.out.println("\n->Currently, top ptr is at " + top);
		append(stack, new_stack, size());
		return new_stack;
	}

	Stack() {
		top = -1;
		stack = new int[N];
	}

	void push(int data) {
		if (top == N - 1){
			// N <<= 1; // Doubles the Stack capacity, when the stack is full
			N = (int) (N * 1.5); // Efficient way to enlarge Stack capacity, i.e. 1.5 times
			stack = newStack();
			stack[++top] = data;
			return;
		}
		stack[++top] = data;
	}

	int pop() {
		if (top == -1) {
			System.out.println("\nStack Underflow!");
			return -1;
		}
		int temp = stack[top];
		stack[top--] = -1;
		return temp;
	}

	int peek() {
		return stack[top];
	}

	int size() {
		return top + 1;
	}

	void display() {
		if (top == -1){
			System.out.println("Stack is empty.");
			return;
		}
		for (int i = 0; i <= top; i++)
			System.out.print(stack[i] + "\t");
		System.out.println();
	}

	void clear() {
		top = -1;
	}
}