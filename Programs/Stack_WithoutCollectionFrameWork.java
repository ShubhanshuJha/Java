import java.util.Scanner;

public class Stack_WithoutCollectionFrameWork{

	public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);

	MyStack<Integer> my_stack = new MyStack<>();

	int choice = 1;
	do{
		System.out.println("Enter value to add: ");
		int n = sc.nextInt();
		my_stack.push(n);

		System.out.println("Press 1 to add node:");
		choice = sc.nextInt();
	}while(choice == 1);

	System.out.println("Displaying the elements of list:");
	my_stack.print();
	System.out.println("Popped value from Stack is: "+my_stack.pop());
	System.out.println("Top value of Stack is: "+my_stack.peek());
	}
}

class MyStack<E>{

	private MyLinkedList<E> myLL = new MyLinkedList();

	void push(E elem){
		myLL.add(elem);
	}

	E pop() throws Exception{
		if (myLL.isEmpty()) {
			throw new Exception("Popping from an empty Stack!!!");
		}
		return (E) myLL.removeLast();
	}

	E peek() throws Exception{
		if(myLL.isEmpty()){
			throw new Exception("Peeking from an empty Stack isn't allowed!!!");
		}
		return (E) myLL.getLast();
	}
	void print(){
		myLL.print();
	}
}