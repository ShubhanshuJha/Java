// Perfectly working code
import java.util.Scanner;

public class ArrayDeque_WithoutCollectionFrameWork{

	public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);

	MyDeque<Integer> my_Deque = new MyDeque<>();

	// int choice = 1;
	// do{
	// 	System.out.println("Enter value to add: ");
	// 	int n = sc.nextInt();
	// 	my_Deque.addToHead(n);

	// 	System.out.println("Press 1 to add node:");
	// 	choice = sc.nextInt();
	// }while(choice == 1);

	// System.out.println("Displaying the current elements of Deque:");
	// my_Deque.print();
	// System.out.println("Adding element to the last of Deque.");
	// my_Deque.addToTail(15);
	// my_Deque.addToTail(17);
	// my_Deque.addToTail(19);
	for (int i = 1; i <= 10001; i++) {
		my_Deque.addToTail(i);
	}
	System.out.println("Size of Deque is: "+my_Deque.sizeOf());
	for (int i = 10001; i <= 20000; i++) {
		my_Deque.addToHead(i);
	}
	System.out.println("Displaying the current elements of Deque:");
	my_Deque.print();
	System.out.println("Size of Deque is: "+my_Deque.sizeOf());
	// System.out.println("Displaying the current elements of Deque:");
	// my_Deque.print();
	for (int i = 1; i <= 10000; i++) {
		my_Deque.removeFirst();
		// System.out.println(my_Deque.removeFirst());
	}
	System.out.println("Size of Deque is: "+my_Deque.sizeOf());
	for (int i = 1; i <= 10000; i++) {
		my_Deque.removeLast();
		// System.out.println(my_Deque.removeLast());
	}
	// System.out.println("Popped last value from Deque is: "+my_Deque.removeLast());
	// System.out.println("Popped first value from Deque is: "+my_Deque.removeFirst());
	System.out.println("Displaying the current elements of Deque:");
	my_Deque.print();
	System.out.println("First value of Deque is: "+my_Deque.peekFirst());
	System.out.println("Last value of Deque is: "+my_Deque.peekLast());
	System.out.println("Size of Deque is: "+my_Deque.sizeOf());
	}
}