import java.util.Scanner;

public class LinkedList_WithoutCollectionFrameWork{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyLinkedList<Integer> myLL = new MyLinkedList<>();

		int choice = 1;
		do{
			System.out.println("Enter value to add: ");
			int n = sc.nextInt();
			myLL.add(n);

			System.out.println("Press 1 to add node:");
			choice = sc.nextInt();
		}while(choice == 1);

		// for (int i = 1; i <= 10; i++) {
		// 	myLL.add(i);
		// }

		System.out.println("Displaying the elements of list:");
		myLL.print();
	}
}

class MyLinkedList<E>{
	Node<E> head;

	public void add(E data){
		Node<E> toAdd = new Node<E>(data);

		if (head == null) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	public static class Node<E>{
		E data;
		Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		}
	}

	void print(){
		Node<E> temp = head;
		System.out.print("[");
		while(temp != null){
			if (temp.next == null)
				System.out.print(temp.data);
			else
				System.out.print(temp.data+", ");
			temp = temp.next;
		}
		System.out.println("]");
	}
}