import java.io.*;
import java.util.Scanner;

public class print extends XMLParserCLI{
    public static void printFile(String filename) throws IOException {

            currentFile = filename;
        Scanner scanner = new Scanner(new File(currentFile));
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
        }
    }








