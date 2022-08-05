import java.util.*;

public class Shubhanshu_Methods_Implementation
 extends Shubhanshu_Methods{
	public static void main(String[] args) {
		Shubhanshu_Methods sj = new Shubhanshu_Methods();
		// List<String> lst = Arrays.asList("Shubhanshu","Jha","123");
		sj.print(sj.pow(2,3));

		List<Integer> intList = new ArrayList<Integer>();
		sj.nextLine();
		sj.print("Square & square roots of numbers from 2 to 10:\n");
		for (int i = 2; i <= 10; i++) {
			intList.add(sj.pow(i,2));
			sj.print(sj.pow(i,2)+" ");
		}
		sj.nextLine();
		for (int i : intList) {
			sj.print(sj.root(i,2)+"  ");
		}
		List<Integer> intList2 = new ArrayList<>();
		sj.nextLine();
		sj.print("Cube & cube roots of numbers from 2 to 10:\n");
		for (int i = 2; i <= 10; i++) {
			intList2.add(sj.pow(i,3));
			sj.print(sj.pow(i,3)+"  ");
		}
		sj.nextLine();
		for (int i : intList2) {
			sj.print(sj.root(i,3)+"   ");
		}
	}
}