public class help {


    public static void printHelp() {
        System.out.println("Commands:");
        System.out.println("  open <filename>        - Load file (creates if doesn't exist)");
        System.out.println("  close                  - Clear loaded records");
        System.out.println("  save                   - Save current records to original file");
        System.out.println("  saveas <filename>      - Save current records to new file");
        System.out.println("  read                   - Show all loaded records");
        System.out.println("  write <name> <address> - Add a new record");
        System.out.println("  exit                   - Exit the program");

        System.out.println("  Additional Commands:");
        System.out.println("  print                   - Load data from opened file");
        System.out.println("  select <id> <key>       - Outputs attribute value by given element ID and attribute key");
        System.out.println("  set <id> <key> <value>  - Assign an attribute value");
        System.out.println("  children <id>           - List of attributes of nested elements");
        System.out.println("  child <id> <n>          - Access the nth successor of an element");
        System.out.println("  text <id>               - Access the text of an item");
        System.out.println("  delete <id> <key>       - Delete an element attribute by key");
        System.out.println("  newchild <id>           - Add a new item successor");
        //System.out.println("  xpath <id> <XPath>      - Returns a list of XML items");
    }
}
