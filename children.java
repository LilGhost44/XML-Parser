public class children extends XMLParserCLI{
    public static void childrenID(String id) {
        boolean flag=false;

        for(Record r:records){
            if(r.id.equals(id)){
                    System.out.println("<name>"+r.name+"</name>");
                System.out.println("<address>"+r.address+"</address>");
                    flag = true;
            }
        }
        if(flag==false){
            System.out.println("No valid id.");
        }
    }
}
