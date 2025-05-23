public class close extends XMLParserCLI{
    public static void closeFile() {
        currentFile = null;
        records.clear();
        System.out.println("File closed and memory cleared.");
    }

}
