/*
main class for the implementation of the functions
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XMLParserCLI {
//attributes
    protected static List<Record> records = new ArrayList<>();   //protected because the attributes need to be visible only inside the package
    protected static String currentFile = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to XML Parser. Type 'help' for available commands.");   //welcoming message

        while (true) {
            System.out.print("> ");    //loop for running in the command line prompt

            String[] input = scanner.nextLine().split(" ", 4);    //maximum 4 inputs in command
            String command = input[0].toLowerCase();  //command is input[0] and set to lowercase

            try {
                switch (command) {    //switch for the functions
                    case "open":
                        if (input.length < 2) {     //the usage requires 2 inputs
                            System.out.println("Usage: open <filename>");
                        } else {
                            open.openFile(input[1]);   //input[1] is the name of the file
                        }
                        break;
                    case "close":
                        if(currentFile == null){    //to close a file we must have one open first
                            System.out.println("No file closed, perform 'open'.");
                        } else { close.closeFile();
                        }
                        break;
                    case "save":
                        if (currentFile == null) {    //every function is available after the 'open'
                            System.out.println("No file opened, perform 'open'.");
                        } else {
                            save.saveFile(currentFile);
                        }
                        break;
                    case "saveas":
                        if(currentFile == null){
                            System.out.println("File not saved, perform 'open'.");
                        } else {
                            if (input.length < 2) {   //usage requires 2 inputs
                                System.out.println("Usage: saveas <filename>");
                            } else {
                                save.saveFile(input[1]);
                            }
                        }
                        break;
                    case "read":
                        if(currentFile == null){
                            System.out.println("Could not read file, perform 'open'.");
                        }else {
                            read.readRecords();
                        }
                        break;
                    case "write":
                        if(currentFile == null){
                            System.out.println("Could not write file, perform 'open'.");
                        }else {
                            if (input.length < 3) {   //requires 3 inputs
                                System.out.println("Usage: write <name> <address> <id>");
                            } else {

                                write.writeRecord(input[1], input[2], input[3]); //input[1] is name, input[2] is address, input[3] is id
                            }
                        }
                        break;
                    case "exit":
                        if(currentFile != null){
                            System.out.println("File is still open. Perform 'close'.");
                        }else{
                        System.out.println("Exiting the program...");
                        return;}
                        break;
                    case "help":
                        help.printHelp();
                        break;
                    case "print":
                        if(currentFile != null) {
                            print.printFile(currentFile);
                        } else {
                            System.out.println("'print' not executed, perform 'open'.");
                        }
                        break;
                    case "select":
                        if(currentFile!=null){
                            select.selectVal(input[1], input[2]); //input[1] is id, input[2] is key(name or address)
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
                        break;
                    case "set":
                        if(currentFile!=null){
                            set.setVal(input[1], input[2],input[3]); //input[1] is id,input[2] is key,input[3] is new value
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
                        break;
                    case "children":
                        if(currentFile!=null){
                            children.childrenID(input[1]);
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
                        break;
                    case "child":
                        if(currentFile!=null){
                            child.childID(input[1],input[2]); //input[1] is id, input[2] 1 for name 2 for address
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
                        break;
                    case "text":
                        if(currentFile!=null){
                            text.text(input[1]);  //input[1] is id
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
                        break;
                    case "delete":
                        if(currentFile!=null){
                            delete.delete(input[1]); //input[1] is id
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
                        break;
                    case "newchild":
                        if(currentFile!=null){
                            Newchild.newchildAdd(input[1]);  //input[1] is id
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
                        break;
                    case "xpath":
                        if(currentFile!=null){
                        if (input.length < 2) { //requires 2 inputs
                            System.out.println("Usage: xpath <query>");
                        } else {
                            xpath.xpath(input[1]);  //this is the query
                        }
                        }else{
                            System.out.println("File not opened, perform 'open'.");
                        }
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


