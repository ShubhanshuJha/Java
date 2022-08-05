import java.util.*;

public class N_ary_Tree{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Tree<Integer> root = takeInput();
		printTree(root);
	}
	public static Tree<Integer> takeInput() {
		println("Enter the data to insert: ");
		int data = sc.nextInt();

		Tree<Integer> root = new Tree<Integer>(data);

		println("Number of children in "+data+":");
		int numOfChildren = sc.nextInt();

		for (int i=0; i<numOfChildren; i++){
			Tree<Integer> childNode = takeInput();
			root.children.add(childNode);
		}
		return root;

	}
	private static void println(String s){
		System.out.println(s);
	}
	private static void printTree(Tree<Integer> root){
		String str = root.data + " : ";
		for (int i=0; i<root.children.size(); i++) {
			// str += root.children.get(i); // This'll give error as it returns address of the child node
			str += root.children.get(i).data + " ";
		}
		println(str);
		for (int i=0; i<root.children.size(); i++){
			printTree(root.children.get(i));
		}
	}
}