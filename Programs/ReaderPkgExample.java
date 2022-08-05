import mypackages.io.Reader;

class ReaderPkgExample {
	public static void main(String[] args) {
		Reader input = new Reader(System.in);
		System.out.println("Enter Your Name: ");
		String name = input.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Enter a letter / character: ");
		char ch = input.nextChar();
		System.out.println("You entered " + ch);
	}
}