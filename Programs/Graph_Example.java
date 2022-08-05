// Implementing a graph of v vertices and e edges
// Traversing through the graph using:
// 1. BFS			and 		2. DFS
import java.io.*;
import java.util.*;

public class Graph_Example{
	private LinkedList<Integer> adj[];
	public Graph_Example(int v){
		adj = new LinkedList[v];
		for (int i=0; i<v; i++)
			adj[i] = new LinkedList<Integer>();
	}
	public void addEdge(int source, int destn){
		adj[source].add(destn);
		adj[destn].add(source);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);

		bw.write("Enter the number of vertices and edges: "); bw.flush();
		String[] input = br.readLine().split(" ");
		int v = Integer.parseInt(input[0]);
		int e = Integer.parseInt(input[1]);

		Graph_Example graph = new Graph_Example(v);

		bw.write("Enter "+e+" edges:\n"); bw.flush();
		for (int i=0; i<e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			// Adding edges in the graph
			graph.addEdge(source, destination);
		} // the graph is complete here
		// Now is the time to do the Traversal, wiz. done via:
		// 1. BFS			2. DFS
		bw.write("Enter the source and the destination node: ");
		bw.flush();
		input = br.readLine().split(" ");
		int source = Integer.parseInt(input[0]);
		int destination = Integer.parseInt(input[1]);
		// bw.write("\nMin. distance is "+
		// 		graph.bfs(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
		bw.write("\nPath possible? "+graph.dfsRecursive(source, destination));
		bw.write("\nPath possible? "+graph.dfsStack(source, destination));
		bw.flush();
	}

	// BFS Algorithm to get min. distance b/w source and destination
	// Remember: BFS consumes more memory
	public int bfs(int src, int destn) {
		boolean[] isVis = new boolean[adj.length];
		int[] answer = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();

		q.add(src);
		answer[src] = -1;
		isVis[src] = true;

		while(!q.isEmpty()){
			int curr = q.poll();
			if (curr == destn) break;

			for (int neighbor : adj[curr]) {
				if (!isVis[neighbor]) {
					isVis[neighbor] = true;
					q.add(neighbor);
					answer[neighbor] = curr;
				}
			}
		}

		int curr = destn;
		int distance = 0;
		while(answer[curr] != -1) {
			System.out.print(curr+" -> ");//Displaying the path
			curr = answer[curr];
			distance++;
		}
		return distance;
	}

	// DFS Algorithm checks if path exits b/w source and destination
	// Remember: DFS does not assures of giving the min. distance
	public boolean dfsUtil(int src, int destn, boolean[] isVis){
		if (src == destn) return true;
		for (int neighbor : adj[src]) {
			if (!isVis[neighbor]) {
				isVis[neighbor] = true;
				boolean isConnected = dfsUtil(neighbor, destn, isVis);
				if (isConnected) return true;
			}
		}
		return false;
	}
	// This is Recursive DFS Implementation
	public boolean dfsRecursive(int source, int destination){
		boolean[] isVis = new boolean[adj.length];
		isVis[source] = true;
		return dfsUtil(source, destination, isVis);
	}
	// This is DFS Implementation using Stack
	public boolean dfsStack(int source, int destination){
		boolean[] isVis = new boolean[adj.length];
		isVis[source] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(source);

		while(!stack.isEmpty()){
			int curr = stack.pop();

			if (curr == destination) return true;
			for (int neighbor : adj[curr]) {
				if (!isVis[neighbor]) {
					isVis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}

		return false;
	}
}