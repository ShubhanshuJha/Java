import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.nio.file.Path;

public class Writing_A_TextFile {
    static FileOutputStream out;
    static FileWriter fw;
    static BufferedWriter bw;
    static File file;

    final static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) throws IOException {
        file = new File("Writer_TextFile.txt");

        System.out.println("Enter -1 in the next line to terminate the reading...");
        String line;
        StringBuilder sb = new StringBuilder();
        while(!(line = sc.nextLine()).equals("-1")) {
            sb.append(line + "\n");
        }
//      System.out.println("\nThe input string is:\n" + sb);

/*-------------------------------------------------------------------------------------------------*/

//      Writing text file using FileWriter
        System.out.println("\n-> Writing the txt file using FileWriter class:");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        
        fw = new FileWriter(file);
        fw.write(sb.toString());
        fw.close();
        System.out.println("Done writing the file using FileWriter.\n");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();

//      Writing text file using Files
        System.out.println("\n\n-> Writing the txt file using Files class:");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        Files.write(Paths.get("Writer_TextFile.txt"), sb.toString().getBytes());
        System.out.println("Done writing the file using Files.\n");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();

//      Writing text file using BufferedWriter
        bw = new BufferedWriter(new FileWriter(file));
        System.out.println("\n\n-> Writing the txt file using BufferedWriter class:");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        bw.write(sb.toString());
        bw.close();
        System.out.println("Done writing the file using BufferedWriter.\n");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();

//      Writing text file using FileOutputStream
        out = new FileOutputStream(file);
        System.out.println("\n\n-> Writing the txt file using FileOutputStream class:");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        byte[] strToBytes = sb.toString().getBytes();
        out.write(strToBytes);
        out.close();
        System.out.println("Done writing the file using FileOutputStream.\n");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();

        System.out.println("Done.");
    }
}