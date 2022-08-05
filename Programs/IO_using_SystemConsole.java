import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import java.util.stream.*;

public class IO_using_SystemConsole implements Runnable {
    private static final void solution() throws IOException {
        String name = console().readLine("Please enter your name: ");
        console().writer().println("Hello " + name);
        int age = Integer.parseInt(String.valueOf(console().readPassword("Enter your age: ")));
        console().printf("Your age is %d\n", age);
        console().format("You've explored the IO operation using System.console().");
    }

    @Override
    public void run() {
        try {
            solution();
        } catch (IOException ignore) {}
    }
    public static void main(String... args) throws IOException {
        new Thread(null, new IO_using_SystemConsole(), "Main", 1 << 26).start();
    }
}