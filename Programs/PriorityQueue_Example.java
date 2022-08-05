import java.util.PriorityQueue;

public class PriorityQueue_Example{
	public static void main(String[] args) {
		// PriorityQueue<String> priorityQueue = new PriorityQueue<>();

		// priorityQueue.add("Kiwi");
		// priorityQueue.add("Apple");
		// priorityQueue.add("Mango");
		// priorityQueue.add("Banana");
		// System.out.println("Current PriorityQueue:\n"+priorityQueue);

		// priorityQueue.offer("Orange");
		// System.out.println("Current PriorityQueue after offer() method:\n"+priorityQueue);

		// System.out.println("After using remove(), Removed value is: "+priorityQueue.remove());
		// System.out.println("After using element(), Topmost value is: "+priorityQueue.element());

		// System.out.println("After using poll(), Removed value is: "+priorityQueue.poll());
		// System.out.println("After using peek(), Topmost value is: "+priorityQueue.peek());

		// System.out.println("After using poll(), Removed value is: "+priorityQueue.poll());
		// System.out.println("After using peek(), Topmost value is: "+priorityQueue.remove());

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		// adding odd numbers in the priorityQueue
		for (int i = 1; i <= 10; i = i+2) {
			priorityQueue.add(i);
		}
		System.out.println("After add(), Current PriorityQueue:\n"+priorityQueue);
		// offering even numbers in the priorityQueue
		for (int i = 2; i <= 10; i = i+2) {
			priorityQueue.offer(i);
		}
		System.out.println("\nAfter offer(), Current PriorityQueue:\n"+priorityQueue);
		// After displaying the current stored elements,
		// We have now observed that the elements aren't stored in a sorted manner in the PriorityQueue.
		System.out.println("\nRemoving elements from the PriorityQueue:");
		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
		// After removing the current stored elements of the PriorityQueue,
		// We have now observed that the elements are popped out in a sorted manner from the PriorityQueue.
	}
}