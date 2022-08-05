public class MyLinkedList<E>{
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
	public Boolean isEmpty(){
		return head == null;
	}
	public void print(){
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
	public E removeLast(){
		Node<E> temp = head;
		if (temp == null) {
			System.out.println("Can't remove element from an empty List!!!");
			return null;
		}
		if(temp.next == null){
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null){
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}

	public E getLast(){
		Node<E> temp = head;
		Node<E> toRemove = head;
		if (temp == null) {
			System.out.println("Empty!!!");
			return null;
		}
		if(temp.next == null){
			return (E) toRemove.data;
		}
		else{
			while(temp.next.next != null){
				temp = temp.next;
			}
			toRemove = temp.next;
		}
		return (E) toRemove.data;
	}
}