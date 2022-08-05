public class EdwardsBirthday {
	public static void main(String[] args) {
		// int n = 1;
		// int n = 5;
		int n = 50;
		System.out.println(maximumPieces(n));
	}
	static int maximumPieces(int n) {
		int m = 1000000007;
		return ((((n % m) * (n % m)) % m + ((n % m) + 2) % m) % m) / 2;
	}
}