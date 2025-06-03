/*
print class. Prints the content of file as it is, keeping its structure.
 */

import java.io.*;
import java.util.Scanner;

public class print extends XMLParserCLI{
    public static void printFile(String filename) throws IOException {

            currentFile = filename;
        Scanner scanner = new Scanner(new File(currentFile));
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();  //print every line store into data
            System.out.println(data);         //print data
        }
        scanner.close();
        }
    }








