import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reading_A_TextFile {
    static OutputStreamWriter osm = new OutputStreamWriter(System.out);
    static FileReader fr;
    static BufferedWriter bw = new BufferedWriter(osm);
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        File file = new File("Reader_TextFile.txt");
        fr = new FileReader(file);

//      Reading text file using FileReader
        System.out.println("\n-> Reading the txt file using FileReader class:");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        int i;
        while((i = fr.read()) != -1) {
            System.out.print((char)i);
        }
        System.out.println();
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();

//      Reading text file using Files
        System.out.println("\n\n-> Reading the txt file using Files class:");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        List<String> list2 = Collections.emptyList();
        list2 = Files.readAllLines(Paths.get("Reader_TextFile.txt"), StandardCharsets.UTF_8);
        list2.forEach(l -> System.out.println(l)); //System.out.println(list2);
        for (int j = 1; j < 25; j++) System.out.print("---");
            System.out.println();

//      Reading text file using BufferedReader
        br = new BufferedReader(new FileReader(file));
        System.out.println("\n\n-> Reading the txt file using BufferedReader class:");
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        String string2 = "";
        while ((string2 = br.readLine()) != null) {
            System.out.println(string2);
        }
        System.out.println();
        for (int j = 1; j < 25; j++) System.out.print("---");
        System.out.println();
        System.out.println("Done.");
    }
}