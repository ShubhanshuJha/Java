package mypackages.io;

import java.io.*;
import java.util.*;

public class Writer {
	private PrintWriter output;
	private OutputStream stream;

    public Writer(OutputStream stream) {
        this.stream = stream;
        output = new PrintWriter(this.stream);
    }

	public void print(String s) {
		output.print(s);
		output.flush();
	}
	public void println(String s) {
		output.println(s);
		output.flush();
	}
	public void println() {
		output.println();
		output.flush();
	}
	public void print(int a) {
		output.print(a);
		output.flush();
	}
	public void println(int a) {
		output.println(a);
		output.flush();
	}
	public void print(char a) {
		output.print(a);
		output.flush();
	}
	public void println(char a) {
		output.println(a);
		output.flush();
	}
	public void print(long a) {
		output.print(a);
	}
	public void println(long a) {
		output.println(a);
		output.flush();
	}
	public void print(short a) {
		output.print(a);
		output.flush();
	}
	public void println(short a) {
		output.println(a);
		output.flush();
	}
	public void print(byte a) {
		output.print(a);
		output.flush();
	}
	public void println(byte a) {
		output.println(a);
		output.flush();
	}
	public void print(double a) {
		output.print(a);
		output.flush();
	}
	public void println(double a) {
		output.println(a);
		output.flush();
	}
	public void print(float a) {
		output.print(a);
		output.flush();
	}
	public void println(float a) {
		output.println(a);
		output.flush();
	}

	public void print(int[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public void println(int[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	public void print(char[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);

		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public void println(char[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	public void print(byte[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public void println(byte[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	public void print(short[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public void println(short[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	public void print(long[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public void println(long[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	public void print(double[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public void println(double[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	public void print(float[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public void println(float[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	// public void print(String[] a) {
	// 	String temp = "[ ";
	// 	for (int i = 0; i < a.length; i++)
	// 		temp += (a[i] + ", ");
	// 	temp = temp.substring(0, temp.length() - 2);
	// 	temp += " ]";
	// 	output.print(temp);
	// 	output.flush();
	// }
	// public void println(String[] a) {
	// 	String temp = "[ ";
	// 	for (int i = 0; i < a.length; i++)
	// 		temp += (a[i] + ", ");
	// 	temp = temp.substring(0, temp.length() - 2);
	// 	temp += " ]";
	// 	output.println(temp);
	// 	output.flush();
	// }
	public void printWithNoSpace(String s) {
		s = s.replaceAll("\\s", "");
		output.println(s);
		output.flush();
	}

	public <T> void print(T[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.print(temp);
		output.flush();
	}
	public <T> void println(T[] a) {
		String temp = "[ ";
		for (int i = 0; i < a.length; i++)
			temp += (a[i] + ", ");
		temp = temp.substring(0, temp.length() - 2);
		temp += " ]";
		output.println(temp);
		output.flush();
	}
	public <T> void printList(ArrayList<T> a) {
		output.print(a);
		output.flush();
	}
	public <T> void printLnList(ArrayList<T> a) {
		output.println(a);
		output.flush();
	}
}