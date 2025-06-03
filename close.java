/*
close function
 */

public class close extends XMLParserCLI{
    public static void closeFile() {
        currentFile = null;      //sets the currentFile to null so that we stop working with it in the other classes
        records.clear();         //clear contents from memory so that we avoid mistakes and overwriting when opening another file
        System.out.println("File closed and memory cleared.");
    }

}
