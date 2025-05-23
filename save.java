

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class save extends XMLParserCLI{
    public static void saveFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

       // writer.write("<people>\n");
        for (Record r : records) {
            writer.write("<person id='"+r.id+"'>\n");
            writer.write("    <name>" + r.name + "</name>\n");
            writer.write("    <address>" + r.address + "</address>\n");
            writer.write("</person>\n");
        }
       // writer.write("</people>\n");

        writer.close();
        currentFile = filename;
        System.out.println("Saved to " + filename);
    }
}
