import java.util.Scanner;

public class QueueUsingLL_WithoutCollectionFrameWork{

	public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);

	MyQueue<Integer> my_queue = new MyQueue<>();

	int choice = 1;
	do{
		System.out.println("Enter value to add: ");
		int n = sc.nextInt();
		my_queue.enqueue(n);

		System.out.println("Press 1 to add node:");
		choice = sc.nextInt();
	}while(choice == 1);

	System.out.println("Displaying the elements of Queue:");
	my_queue.print();
	System.out.println("Popped value from Queue is: "+my_queue.dequeue());
	System.out.println("Top value of Queue is: "+my_queue.peek());
	}
}

class MyQueue<E>{
	public static class Node<E>{
		E data;
		Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		}
	}

	private Node<E> head, rear;

	void enqueue(E elem){
		Node<E> toAdd = new Node(elem);
		if(head == null){
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}

	E dequeue() throws Exception{
		if (head == null) {
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		if (head == null) {
			rear = null;
		}
		return temp.data;
	}

	E peek() throws Exception{
		if (head == null) {
			return null;
		}
		return head.data;
	}

	void print(){
		Node<E> temp = head;
		System.out.print("[");
		while(temp != null){
			if (temp.next == null) {
				System.out.print(temp.data);
			}
			else{
				System.out.print(temp.data+", ");
			}
			temp = temp.next;
		}
		System.out.print("]\n");
	}
}