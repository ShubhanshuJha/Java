public class countHydraHead{
	public static void main(String[] args) {
		int cut;
		for (cut = 1; cut <= 28 ; cut++) {
			headCount(cut);
		}
		System.out.println(cut);
	}
	static int headCount(int n){
		int head = 1;
		return head*2;
	}
}