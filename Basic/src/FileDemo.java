import java.io.File;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        // Create a File object
        File file = new File(fileName);

        // Display information about the file
        System.out.println("File Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Exists: " + file.exists());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Last Modified: " + file.lastModified());
        System.out.println("Length: " + file.length() + " bytes");

        // Delete the file
        file.delete();
    }
}
