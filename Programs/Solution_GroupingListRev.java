import java.util.*;

public class Solution_GroupingListRev{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();

		int a = sc.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		int bound = a / 2;

		for (int i = a - 1; i >= 0; i--){
			if (i > bound) {
				list1.add(arr[i]);
			}
			else if (i == bound) {
				list2.add(arr[i]);
			}
			else{
				list3.add(arr[i]);
			}
		}
		String m = list1.toString();
		String n = list3.toString();

		m = m.replaceAll("\\s", "");
		n = n.replaceAll("\\s", "");

		System.out.print(m+"-"+list2+"-"+n);
	}
}