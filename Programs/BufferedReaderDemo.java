import java.io.*;
// Above package includes everything wiz. below:
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

class BufferedReaderDemo{
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\shubh\\Desktop\\Test.txt");
		BufferedReader br=new BufferedReader(fr);
		char c[]=new char[20];
		if (br.markSupported()) {
			System.out.println("mark () is supported.");
			br.mark(100);
		}
		br.skip(10);
		if (br.ready()) {
			System.out.println(br.readLine());
			br.read(c);
			for (int i=0; i<20; i++) {
				System.out.print(c[i]);
			}
			System.out.println();
			br.reset();
			for (int i=0; i<10; i++) {
				System.out.print((char)br.read());
			}
		}
	}
}