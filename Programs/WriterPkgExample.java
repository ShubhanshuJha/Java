import mypackages.io.Writer;
import java.io.*;
import java.util.*;

class WriterPkgExample {
	public static void main(String[] args) throws IOException {
		Writer output = new Writer(System.out);
		byte bt = 2;
		output.println(bt);

		short no = 10;
		output.println(no);

		long ln = 1523232L;
		output.println(ln);

		float ft = 2.5f;
		output.println(ft);

		float[] flt = {10.5f, 20.3f, 33.9f};
		output.println(flt);

		int[] even = {2, 4, 6, 8, 10};
		output.println(even);

		Integer[] odd = {1, 3, 5, 7, 9};
		output.println(odd);

		String[] str = {"Hello", "Hi", "Hola", "Ni How"};
		output.println(str);

		output.printWithNoSpace("  He ll   O   ");

		ArrayList<Integer> cList = new ArrayList<>();
		for (int i = 5; i <= 50; i += 5)
			cList.add(i);
		output.printLnList(cList);
		output.println();

		output.print("Program ");
		output.println("Ended!!!");
		output.println();
	}
}