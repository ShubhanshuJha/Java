// There is a grid of size 10^5 x 10^5, covered completely in railway tracks. Tom is riding in a train,
// currently in cell (a,b), & Jerry is tied up in a different cell (c,d), unable to move. The train has no
// breaks. It shall move exactly K steps, and then its fuel will run out and it shall stop. In one step, the
// train must move to one of its neighboring cells, sharing a side. Tom can't move without the train, as the
// grid is covered in tracks. Can Tom reach Jerry's cell after exactly K steps?
// Note: Tom can go back to the same cell multiple times.
import java.io.*;
import java.util.*;

class TomAndJerry_Codechef{
	static int count=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		// Shortest dist b/w Tom at (a,b) & Jerry at (c,d) is given by:
		// dist = absoluteValue(a-c) + absoluteValue(b-d);
		// If K < dist, then not possible to reach Jerry.
		// If K = dist, then possible to reach Jerry.
		// If K > dist, then have to check.
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			String[] inp = br.readLine().split(" ");
			int a = Integer.parseInt(inp[0]);
			int b = Integer.parseInt(inp[1]);
			int c = Integer.parseInt(inp[2]);
			int d = Integer.parseInt(inp[3]);
			int K = Integer.parseInt(inp[4]);

			int dist = Math.abs(a-c) + Math.abs(b-d);
			if (K >= dist && K % 2 == dist % 2) {
				bw.write("YES\n");
			}
			else{
				bw.write("NO\n");
			}
			bw.flush();
		}
	}
}