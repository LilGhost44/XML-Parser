public class select extends XMLParserCLI{
    public static void selectVal(String id, String key) {
        boolean flag=false;

        for(Record r:records){
            if(r.id.equals(id)){
                if(key.equals("address")){
                    System.out.println("ID: "+ r.id+", Address: "+r.address);
                    flag = true;
                } else if(key.equals("name")){
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
