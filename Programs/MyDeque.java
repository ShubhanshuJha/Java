public class MyDeque<E>{
	E data;
	int size = 0;
	public static class Node<E>{
		E data;
		Node<E> next, prev;
		public Node(E data){
			this.data = data;
			this.next = this.prev = null;
		}
	}
	Node<E> head, tail;

	public void addToHead(E data){
		size++;
		Node toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
			return;
		}
		if (head.next == null) {
			head.prev = toAdd;
			toAdd.next = head;
			toAdd.prev = null;
			head = toAdd;
			return;
		}
		head.prev = toAdd;
		toAdd.next = head;
		head = toAdd;
	}

	public void addToTail(E data){
		size++;
		Node toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
			return;
		}
		if (head.next == null) {
			head.next = toAdd;
			toAdd.prev = head;
			toAdd.next = null;
			tail = toAdd;
			return;
		}
		tail.next = toAdd;
		toAdd.prev = tail;
		tail = toAdd;
	}

	public E removeLast(){
		size--;
		if (head == null) {
			size = 0;
			return null;
		}
		Node<E> toRemove = tail;
		if(tail.prev == null){
			head = tail = null;
			return toRemove.data;
		}
		tail = tail.prev;
		tail.next = null;

		// if (tail == null) {
		// 	head = null;
		// }
		return toRemove.data;
	}

	public E removeFirst(){
		size--;
		if (head == null) {
			size = 0;
			return null;
		}
		Node<E> toRemove = head;
		if(head.next == null){
			head = tail = null;
			return toRemove.data;
		}
		head = head.next;
		head.prev = null;

		return toRemove.data;
	}

	public void print(){
		Node<E> temp = head;
		System.out.print("[");
		while(temp != null){
			if (temp.next == null){
				System.out.print(temp.data);
				break;
			}
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
		System.out.println("]");
	}
	public E peekFirst(){
		if (head == null) {
			return null;
		}
		return head.data;
	}
	public E peekLast(){
		if (head == null) {
			return null;
		}
		return tail.data;
	}
	public int sizeOf(){
		return size;
	}
}