/*
select function. Based on id, we print either the name or the address of a record.
 */

public class select extends XMLParserCLI{
    public static void selectVal(String id, String key) {
        boolean flag=false;

        for(Record r:records){
            if(r.id.equals(id)){      //match id
                if(key.equals("address")){      //match address
                    System.out.println("ID: "+ r.id+", Address: "+r.address);
                    flag = true;  //flag true means we went through the if
                } else if(key.equals("name")){      //match name
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
