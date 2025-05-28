public class set extends XMLParserCLI{
    public static void setVal(String id, String key, String value){
        boolean flag=false;

        for(Record r:records){
            if(r.id.equals(id)){
                if(key.equals("address")){
                    r.setAddress(value);
                    System.out.println("ID: "+ r.id+", Address: "+r.address);
                    flag = true;
                } else if(key.equals("name")){
                    r.setName(value);
                    System.out.println("ID: "+ r.id+", Name: "+r.name);
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("No valid id or attribute.");
        }
    }
}
