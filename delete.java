public class delete extends XMLParserCLI{
    public static void delete(String id){

        for (int i = 0; i < records.size(); i++) {
            Record r = records.get(i);
            if (r.id.equals(id)) {
                records.remove(i);
                System.out.println("Deleted record with ID: " + id);
                return;
            }
        }
        System.out.println("No record found with ID: " + id);
    }
}
