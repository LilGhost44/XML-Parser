/*
class for writing to file.
 */

public class write extends XMLParserCLI{

    public static void writeRecord(String name, String address, String id) {
        int counter=1;     //counter for already existing id
        int counterNull=1;   //counter if id is null

        if(id.equals("null")){
            String nullCounter = Integer.toString(counterNull);   //conversion from integer to String
            id = nullCounter;
            counterNull++;   //increment counter for null value

        }

        for(Record r:records){       //we parse the list for matching id
            if(id.equals(r.id)){

                String strCounter = Integer.toString(counter);  //convert from integer to String
                id = id.concat("_"+strCounter);     //concat and set new id
                counter++;    //increment counter for duplicate id
            }
        }
        records.add(new Record(name, address,id));      //add record
        System.out.println("Record added.");
    }
}
