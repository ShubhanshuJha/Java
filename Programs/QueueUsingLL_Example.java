import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class QueueUsingLL_Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Integer> q = new LinkedList<>();

		// When we want to add item to a full Queue using add() method,
		// then this will throw Exception.
		q.add(56);
		q.add(91);
		q.add(20);
		// But, in those case, if we use offer() method, which this will return null rather than exception.
		q.offer(90);
		q.offer(2);

		System.out.println("Current elements in Queue is:\n"+q);

		// When we want to remove an item from an empty Queue using remove() method,
		// then this will throw Exception.
		System.out.println("Removed element Of Queue is: "+q.remove());
		// But, in those case, if we use poll() method, then this will return null.
		// System.out.println(q.poll());

		// When we want to get the top item from empty Queue using element() method,
		// then this will throw Exception.
		System.out.println("Current top element in Queue is: "+q.element());
		// But, in those case, if we use peek() method, which this will return null.
		// System.out.println("Current top element in Queue is: "+q.peek());

		System.out.println("Current elements in Queue is:\n"+q);
		
	}
}