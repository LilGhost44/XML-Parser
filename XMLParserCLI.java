

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XMLParserCLI {

    protected static List<Record> records = new ArrayList<>();
    protected static String currentFile = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to XML Parser. Type 'help' for commands.");

        while (true) {
            System.out.print("> ");

            String[] input = scanner.nextLine().split(" ", 4);
            String command = input[0].toLowerCase();

            try {
                switch (command) {
                    case "open":
                        if (input.length < 2) {
                            System.out.println("Usage: open <filename>");
                        } else {
                            open.openFile(input[1]);
                        }
                        break;
                    case "close":
                        close.closeFile();
                        break;
                    case "save":
                        if (currentFile == null) {
                            System.out.println("No file opened.");
                        } else {
                            save.saveFile(currentFile);
                        }
                        break;
                    case "saveas":
                        if (input.length < 2) {
                            System.out.println("Usage: saveas <filename>");
                        } else {
                            save.saveFile(input[1]);
                        }
                        break;
                    case "read":
                        read.readRecords();
                        break;
                    case "write":
                        if (input.length < 3) {
                            System.out.println("Usage: write <name> <address> <id>");
                        } else {

                            write.writeRecord(input[1], input[2], input[3]);
                        }
                        break;
                    case "exit":
                        System.out.println("Exiting the program...");
                        return;
                    case "help":

                        help.printHelp();
                        break;
                    default:
                        System.out.println("Unknown command. Type 'help' to see available commands.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}


