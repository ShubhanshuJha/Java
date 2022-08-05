import java.util.*;

public class FormatSpecifiers{
	public static void main(String[] args) {
		// This does the same thing as the StringBuilder example above
		int one = 1;
		String color = "red";
		Formatter form = new Formatter();
		System.out.print(form.format("One=%d, colour=%s%n", one, color));
		// Implementing the above statements:
		System.out.printf("One=%d, colour=%s%n", one, color);

		// Prints "One=1, Colour=red" followed by the platform's line separator
		// The same thing using the `String.format` convenience method
		System.out.print(String.format("One=%d, color=%s%n", one, color));

		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (String s : new String[]{"A", "B", "C"}) {
			sj.add(s);
		}
		System.out.println(sj);
		// Prints "[A, B, C]"

		// %d, %c, %12d, %10s, %1.2f, %15.8e and %1.8g
		int i = 1234, j = 52;
		System.out.printf("The value are %d and %1d\n",j,i);
		char c = 's';
		System.out.printf("The given character is %c%n",c);
		double d = 12345.123456789101112;
		System.out.printf("The given double value is %f , upto 4 decimal points, it can be %1.4f\n",d,d);
		float f = 654321.65432f;
		System.out.printf("The given float value is %f, upto 2 decimal points, it can be %1.2f%n",f,f);
		// long l = 123456789;
		System.out.printf("The given value (2.0e+5) can be written as %15.8e and %1.8g\n",2.0e+5,2.0e+5);
		String s = "Shubhanshu Jha";
		System.out.printf("The given String value is %10s.%n",s);
	}
}