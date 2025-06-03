/*
set class. We change the value of the name or the address based on id.
 */

public class set extends XMLParserCLI{
    public static void setVal(String id, String key, String value){
        boolean flag=false;

        for(Record r:records){
            if(r.id.equals(id)){    //match id
                if(key.equals("address")){     //set address
                    r.setAddress(value);
                    System.out.println("ID: "+ r.id+", Address: "+r.address);   //print result
                    flag = true;
                } else if(key.equals("name")){     //match name
                    r.setName(value);       //set name
                    System.out.println("ID: "+ r.id+", Name: "+r.name);   //print result
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("No valid id or attribute.");
        }
    }
}
