public class help {


    public static void printHelp() {
        System.out.println("Commands:");
        System.out.println("  open <filename>     - Load file (creates if doesn't exist)");
        System.out.println("  close               - Clear loaded records");
        System.out.println("  save                - Save current records to original file");
        System.out.println("  saveas <filename>   - Save current records to new file");
        System.out.println("  read                - Show all loaded records");
        System.out.println("  write <name> <email> - Add a new record");
        System.out.println("  exit                - Exit the program");
    }
}
