public class child extends XMLParserCLI{
    public static void childID(String id, String n) {
        boolean flag=false;
        //child <id> <n>
        for(Record r:records){
            if(r.id.equals(id)){
                if(n.equals("1")){
                    System.out.println("Name: "+r.name);
                    flag = true;
                } else if(n.equals("2")){
                    System.out.println("Address: "+r.address);
                    flag = true;
                } else{
                    System.out.println("<n> index out of bounds...");
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("No valid id or index.");
        }

    }
}
