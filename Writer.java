import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

String filepath=""; //pass to FileWriter
String textContent = "";

//for filepath ("C://Users//HP//Desktop//test.txt")
        try(FileWriter writer = new FileWriter("test.txt")){
writer.write("I like pizza");
            System.out.println("File has been written.");
        }catch(FileNotFoundException e){
            System.out.println("Could not locate file.");
        }
        catch (IOException e){
            System.out.println("Could not write file.");

        }
    }
}
