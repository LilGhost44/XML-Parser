/*
opens file, loads content into memory
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class open extends XMLParserCLI{
    public static void openFile(String filename) throws IOException {
        File file = new File(filename);
        currentFile = filename;      //sets currentFile
        records.clear();             //clears memory before loading the data

        if (!file.exists()) {        //create new file if it doesnt exist
            file.createNewFile();
            System.out.println("File did not exist. Created new file: " + filename);
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String name = null, address = null, id=null;     //set attributes to null before loading, so that we avoid overwriting and mistakes


        while ((line = reader.readLine()) != null) {
            line = line.trim();       //trim spaces from each line for clean reading
            if(line.startsWith("<person id='")&&line.endsWith("'>")){     //extract value for id
                id = line.substring(12,line.length() - 2);
            }else if (line.startsWith("<name>") && line.endsWith("</name>")) {   //extract value for name
                name = line.substring(6, line.length() - 7);
            } else if (line.startsWith("<address>") && line.endsWith("</address>")) {   //extract value for address
                address = line.substring(9, line.length() - 10);
            } else if (line.equals("</person>")) {
                if (name != null && address!= null && id!=null) {
                    records.add(new Record(name,address,id));
                    name = null;    // end of file and set everything back to null
                    address = null;
                    id = null;
                }




            }
        }

        reader.close();
        System.out.println("File loaded successfully.");
    }
}
