import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {

        try{
            FileReader reader = new FileReader("test.txt");
            int data = reader.read();
            while(data !=-1){
                System.out.print((char)data); //print used not println, prints every new line otherwise
                data = reader.read();
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
