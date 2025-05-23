import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class open extends XMLParserCLI{
    public static void openFile(String filename) throws IOException {
        File file = new File(filename);
        currentFile = filename;
        records.clear();

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File did not exist. Created new file: " + filename);
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String name = null, address = null, id=null;


        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if(line.startsWith("<person id='")&&line.endsWith("'>")){
                id = line.substring(12,line.length() - 2);
            }else if (line.startsWith("<name>") && line.endsWith("</name>")) {
                name = line.substring(6, line.length() - 7);
            } else if (line.startsWith("<address>") && line.endsWith("</address>")) {
                address = line.substring(9, line.length() - 10);
            } else if (line.equals("</person>")) {
                if (name != null && address != null) {
                    records.add(new Record(name, address,id));
                    name = null;
                    address = null;
                    id = null;
                }
            }
        }

        reader.close();
        System.out.println("File loaded successfully.");
    }
}
