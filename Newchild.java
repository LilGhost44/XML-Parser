public class Newchild extends XMLParserCLI{
    public static void newchildAdd(String id){
        int counter=1;
       // int counterNull=1;

       /* if(id.isEmpty()){
            String nullCounter = Integer.toString(counterNull);
            id = nullCounter;
            counterNull++;

        }*/

        for(Record r:records){
            if(id.equals(r.id)){

                String strCounter = Integer.toString(counter);
                id = id.concat("_"+strCounter);
                counter++;
            }
        }


        records.add(new Record(null, null,id));
        System.out.println("Record added.");
    }
}
