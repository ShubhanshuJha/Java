import java.util.ArrayDeque;
// import java.util.Scanner;
import java.util.Queue;

public class ArrayDeque_Example{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		ArrayDeque<Integer> array_Deq = new ArrayDeque<>();

		for (int i = 1; i <= 10; i = i+2) {
			array_Deq.offerFirst(i);
		}
		System.out.println("Displaying the current ArrayDeque:\n"+array_Deq);
		for (int i = 2; i <= 10; i = i+2) {
			array_Deq.offerLast(i);
		}
		System.out.println("Displaying the current ArrayDeque after offerLast() method:\n"+array_Deq);
		array_Deq.push(90);
		array_Deq.push(21);
		System.out.println("After using push(), the ArrayDeque is:\n"+array_Deq);
		System.out.println("After using pop(), Popped value is: "+array_Deq.pop());
		System.out.println("After using peek(), Topmost value is: "+array_Deq.peek());
	}
}