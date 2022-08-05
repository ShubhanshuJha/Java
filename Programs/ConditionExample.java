import java.util.*;
public class ConditionExample{
	private static int f(int x, int y){
		if (x<y) {
			System.out.println("X<Y");
			return y+x;
		}
		else {
			System.out.println("X>=Y");
			if (x>8) {
				return y+7;
			}
		}
		return x-2;
	}
	public static void main(String[] args) {
		int a=f(3,4);
		int b=f(a,5);
		System.out.println(b);
	}
}