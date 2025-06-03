/*
saveas class. Saves the changes in a different destination. If the other file does not exist, we create one.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class saveas extends XMLParserCLI{
    public static void saveas(String newFilename) throws IOException {
        if (records.isEmpty()) {           //check for empty list
            System.out.println("No data to save.");
            return;
        }

        File file = new File(newFilename);

        // Create file if it doesn't exist
        if (!file.exists()) {
            boolean created = file.createNewFile();
            if (!created) {
                System.out.println("Failed to create the file.");
                return;
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));


        for (Record r : records) {         //we parse the records list and write
            writer.write("<person id='"+r.id+"'>\n");
            writer.write("    <name>" + r.name + "</name>\n");
            writer.write("    <address>" + r.address + "</address>\n");
            writer.write("</person>\n");
        }

        writer.close();

        System.out.println("File saved as: " + newFilename);
    }
}
