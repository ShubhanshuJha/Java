import java.io.*;
import java.util.*;

public class BinaryTree{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		bw.write("Creating Binary Tree\n"); bw.flush();
		Node<Integer> root = createTree();

		bw.write("\nTraversing the Tree as InOrder Treversal:\n"); bw.flush();
		inOrder(root);
		bw.write("\nTraversing the Tree as PreOrder Treversal:\n"); bw.flush();
		preOrder(root);
		bw.write("\nTraversing the Tree as PostOrder Treversal:\n"); bw.flush();
		postOrder(root);
	}
	// This method is used to make a Tree of Integer data type
	static Node<Integer> createTree() throws IOException{
		Node<Integer> root = null;
		bw.write("Enter the data: "); bw.flush();
		int nodeVal = Integer.parseInt(br.readLine());

		if (nodeVal == -1) return null;

		root = new Node<Integer>(nodeVal);

		bw.write("Enter left for "+nodeVal+"\n"); bw.flush();
		root.left = createTree();

		bw.write("Enter right for "+nodeVal+"\n"); bw.flush();
		root.right = createTree();

		return root;
	}
	// Doing InOrder Treversal of the Tree
	static void inOrder(Node<Integer> root) throws IOException{
		if (root == null) return;

		inOrder(root.left);
		bw.write(root.data+" "); bw.flush();
		inOrder(root.right);
	}
	// Doing PreOrder Treversal of the Tree
	static void preOrder(Node<Integer> root) throws IOException{
		if (root == null) return;

		bw.write(root.data+" "); bw.flush();
		preOrder(root.left);
		preOrder(root.right);
	}
	// Doing PostOrder Treversal of the Tree
	static void postOrder(Node<Integer> root) throws IOException{
		if (root == null) return;

		postOrder(root.left);
		postOrder(root.right);
		bw.write(root.data+" "); bw.flush();
	}
}
class Node<T>{
	Node<T> left, right;
	T data;
	public Node(T data){
		this.data = data;
	}
}