/*
text function. We print the record based on id, according to its toString() method. Id: , name: ,address:
 */

public class text extends XMLParserCLI{
    public static void text(String id) {
        boolean flag=false;

        for(Record r:records){
            if(r.id.equals(id)){
                System.out.println(r);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("No valid id or attribute.");
        }
    }
}
