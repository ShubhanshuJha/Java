public class PrintASCII_CharWithVal{
	public static void main(String[] args) {
		for (int i = 1; i <= 117; i+=20){
			for(int j = i; j < i+10; j++){
				if (j > 117)
					break;
				System.out.print((j + "\t:\t" + (char)j) +"\t"+ (j+10 + "\t:\t" + (char)(j+10)) +"\n");
			}
			System.out.println();
		}
		for (int i = 121; i <= 127; i++) {
			System.out.print(i + "\t:\t" + (char)i +"\n");
		}
	}
}