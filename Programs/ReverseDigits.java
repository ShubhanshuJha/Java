import mypackages.io.Writer;
import mypackages.io.Reader;

class ReverseDigits {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter a number: ");
			Long n = reader.nextLong();
			writer.println("Reverse of the number is: " + reverse_digit(n));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static long reverse_digit(long n) {
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}