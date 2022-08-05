import mypackages.io.Writer;

class InputUsing_CLA {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		try {
			writer.print("Hello " + args[0]);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}