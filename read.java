/*
read function. Prints every record according to their toString() method.
 */

public class read extends XMLParserCLI{
    public static void readRecords() {
        if (records.isEmpty()) {
            System.out.println("No records loaded.");
        } else {
            for (Record r : records) {
                System.out.println(r);
            }
        }
    }

}
