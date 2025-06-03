/*
Newchild function. Creates a new record at the end of the file only with id filled.
 */

public class Newchild extends XMLParserCLI{
    public static void newchildAdd(String id){
        int counter=1;        //counter if one file has same id with another
        int counterNull=1;    //counter if the file has null id

        if(id.equals("null")){
            String nullCounter = Integer.toString(counterNull);     //we convert integer to String and put it in nullCounter
            id = nullCounter;
            counterNull++;        //increment counter

        }

        for(Record r:records){
            if(id.equals(r.id)){

                String strCounter = Integer.toString(counter);    //conversion from integer to string
                id = id.concat("_"+strCounter);      //concat the counter
                counter++;   //increment counter
            }
        }


        records.add(new Record(null, null,id));       //add record only with id
        System.out.println("Record added.");
    }
}
