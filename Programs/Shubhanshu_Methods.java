import java.util.*;

public class Shubhanshu_Methods extends Arithmetic_Methods{
	static int print(int i){
		System.out.print(i);
		return i;
	}
	static double print(double d){
		System.out.print(d);
		return d;
	}
	static float print(float f){
		System.out.print(f);
		return f;
	}
	static boolean print(boolean b){
		System.out.print(b);
		return b;
	}
	static String print(String s){
		System.out.print(s);
		return s;
	}
	static List print(List l){
		System.out.print(l);
		return l;
	}
	static char print(char c){
		System.out.print(c);
		return c;
	}
	static void nextLine(){
		System.out.println();
	}
}
class Arithmetic_Methods{
	static int add(int a, int b){
		return a+b;
	}
	static int add(int a, int b, int c){
		return a+b+c;
	}
	static int add(int a, int b, int c, int d){
		return a+b+c+d;
	}
	static double add(double a, double b){
		return a+b;
	}
	static double add(double a, double b, double c){
		return a+b+c;
	}
	static double add(double a, double b, double c, double d){
		return a+b+c+d;
	}

	static int sub(int a, int b){
		return a-b;
	}
	static int sub(int a, int b, int c){
		return (a-b)-c;
	}
	static int sub(int a, int b, int c, int d){
		return ((a-b)-c)-d;
	}
	static double sub(double a, double b){
		return a-b;
	}
	static double sub(double a, double b, double c){
		return (a-b)-c;
	}
	static double sub(double a, double b, double c, double d){
		return ((a-b)-c)-d;
	}

	static int mult(int a, int b){
		return a*b;
	}
	static int mult(int a, int b, int c){
		return a*b*c;
	}
	static int mult(int a, int b, int c, int d){
		return a*b*c*d;
	}
	static double mult(double a, double b){
		return a*b;
	}
	static double mult(double a, double b, double c){
		return a*b*c;
	}
	static double mult(double a, double b, double c, double d){
		return a*b*c*d;
	}

	static int div(int a, int b){
		return a/b;
	}
	static int div(int a, int b, int c){
		return (a/b)/c;
	}
	static int div(int a, int b, int c, int d){
		return ((a/b)/c)/d;
	}
	static double div(double a, double b){
		return a/b;
	}
	static double div(double a, double b, double c){
		return (a/b)/c;
	}
	static double div(double a, double b, double c, double d){
		return ((a/b)/c)/d;
	}

	static int mod(int a, int b){
		return a%b;
	}
	static int mod(int a, int b, int c){
		return (a%b)%c;
	}
	static int mod(int a, int b, int c, int d){
		return ((a%b)%c)%d;
	}

	static int pow(int a, int b){
		int result = a;
		for (int i = 2; i <= b; i++) {
			result *= a;
		}
		return result;
	}
	static float pow(float a, float b){
		float result = a;
		for (int i = 2; i <= b; i++) {
			result *= a;
		}
		return result;
	}
	static double pow(double a, double b){
		double result = a;
		for (int i = 2; i <= b; i++) {
			result *= a;
		}
		return result;
	}

	static int root(int a, int b){
		int val = 0; 
		for (int i = 1; i <= a; i++) {
			int result = pow(i,b);
			if (result == a) {
				val = i;
				break;
			}
		}
		return val;
	}
	static float root(float a, float b){
		float val = 0;
		for (float i = 1; i <= a; i++) {
			float result = pow(i,b);
			if (result == a) {
				val = i;
				break;
			}
		}
		return val;
	}
	static double root(double a, double b){
		double val = 0;
		for (double i = 1; i <= a; i++) {
			double result = pow(i,b);
			if (result == a) {
				val = i;
				break;
			}
		}
		return val;
	}
}