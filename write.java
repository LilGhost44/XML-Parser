public class write extends XMLParserCLI{

    public static void writeRecord(String name, String address, String id) {
       /* int counter=1;
        int counterNull=1;

        if(id.isEmpty()){
            String nullCounter = Integer.toString(counterNull);
            id = nullCounter;
            counterNull++;

        }
        for(Record r:records){
            if(id.equals(r.id)){

                String strCounter = Integer.toString(counter);
                id = id.concat("_"+strCounter);
                counter++;
            }
        }*/
        records.add(new Record(name, address,id));
        System.out.println("Record added.");
    }
}
