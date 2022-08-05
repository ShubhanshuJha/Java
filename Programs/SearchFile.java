import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import static java.nio.file.FileVisitOption.*;
import java.nio.file.*;
// import java.nio.file.FileVisitOption.FOLLOW_LINKS;
import java.util.Scanner;
import java.util.EnumSet;


public class SearchFile{
	SearchFile(String input){
		Path file = Paths.get("D:\\Java Programming");
		// Path file = Paths.get("This PC");
		try{
		// Anonymous class for a SimpleFileVisitor
			SimpleFileVisitor<Path> pathVisitor = new SimpleFileVisitor<>(){
			// method to search the file in all the directory
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
					if (file.getFileName().toString().contains(input)) {
						System.out.println("File you have searched is: " + file);
					}
					return FileVisitResult.CONTINUE;
				}
			// method that report the error or handle them
				@Override
				public FileVisitResult visitFileFailed(Path p, IOException e){
					System.err.println("Error " + e + p);
					return FileVisitResult.CONTINUE;
				}
			};
		// Enum to handle the symbolic link in the file
			EnumSet<FileVisitOption> option = EnumSet.of(FOLLOW_LINKS);
			Files.walkFileTree(file, option, 5, pathVisitor);
		} catch (Exception e) {}
	}
	public static void main(String[] args) throws IOException{
		System.out.print("Enter the file name: ");
		@SuppressWarnings("resources")
		final String input = (new Scanner(System.in)).nextLine();
		SearchFile sf = new SearchFile(input);
	}
}