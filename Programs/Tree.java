import java.util.*;

public class Tree<E>{
	public E data;
	public ArrayList<Tree<E>> children;

	public Tree(E data){
		this.data = data;
		children = new ArrayList<>();
	}
}