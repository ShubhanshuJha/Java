import java.util.*;
import java.io.*;
class ZooDesign{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String strCPS=sc.nextLine();
		String area=sc.nextLine();
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String str3=sc.nextLine();
		int=sc.nextInt();

		String str=strCPS.split(" ");
		String mArea=area.split(" ");
		String strH=str1.split(" ");
		String strC=str2.split(" ");
		String strA=str3.split(" ");

		int[] arrCPS=new int[str.length()];
		int[] maxArea=new int[mArea.length()];
		int[] areaH=new int[strH.length()];
		int[] areaC=new int[strC.length()];
		int[] areaA=new int[strA.length()];


		for (int i=1;i<=str.length();i++){
			String n=str[i];
			arrCPS[i]=Integer.parseInt(n);
		}

		for (int i=1;i<=mArea.length();i++) {
			String a=mArea[i];
			maxArea[i]=Integer.parseInt();
		}

		for (int i=1;i<=strH.length();i++) {
			String b=strH[i];
			areaH[i]=Integer.parseInt(b);
		}		

		for (int i=1;i<=strC.length();i++) {
			String c=strC[i];
			areaC[i]=Integer.parseInt(c);
		}

		for (int i=1;i<=strA.length();i++) {
			String d=strA[i];
			areaA[i]=Integer.parseInt(d);
		}

		for (int i=1;i<=str.length();i++) {
			if (arrCPS[i]>arrCPS[i+1]&&arrCPS[i]>arrCPS[i+2]) {
				int costly=arrCPS[i]*areaH[i]*areaH[i+1];
			}
			if (int arrCPS[i]<arr[i+2]&&arrCPS[i+2]<arrCPS[i+1]) {
				int 
			}
		}
	}
}