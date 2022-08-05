import mypackages.io.Writer;
import mypackages.io.Reader;

class One_s_Complement {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter a number: ");
			int n = reader.nextInt();
			writer.println("One's Compliment of the number is: " + onesComplement(n));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static int onesComplement(int N){
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(N));
        for(int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                sb.setCharAt(i, '0');
            } else {
                sb.setCharAt(i, '1');
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}