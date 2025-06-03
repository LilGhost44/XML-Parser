/*
xpath implementation. We execute queries.
 */

public class xpath extends XMLParserCLI{
    public static void xpath(String query){

            if (records.isEmpty()) {      //check for empty list
                System.out.println("No data loaded.");
                return;
            }

            if (query.contains("@")) {     //query selected based on character
                alphaOperator(query);
            } else if (query.contains("=")) {
                equalOperator(query);
            } else if (query.matches(".*\\[\\d+\\]$")) {   //for format person/address[1]
                indexedOperator(query);
            } else {
                slashOperator(query);
            }
        }
    private static void alphaOperator(String query) {

        if (query.equals("person@id")) {
            for (Record r : records) {
                System.out.println(r.id); //print ids of all records
            }
        } else {
            System.out.println("Unsupported attribute query.");
        }
    }
    private static void slashOperator(String query) {
        if (query.equals("person/address")) {
            for (Record r : records) {
                System.out.println(r.address);
            }
        } else if (query.equals("person/name")) {
            for (Record r : records) {
                System.out.println(r.name);
            }
        } else {
            System.out.println("Unsupported field query.");
        }
    }
    private static void indexedOperator(String query) {

        try {
            int startBracket = query.indexOf('[');  //we keep the indexes of the characters to extract the information between them
            int endBracket = query.indexOf(']');
            int slash = query.indexOf('/');

            if (slash == -1 || startBracket == -1 || endBracket == -1) {  //check format of query
                System.out.println("Invalid indexed query format.");
                return;
            }

            String field = query.substring(slash + 1, startBracket); // extract value between '/' and '['
            int index = Integer.parseInt(query.substring(startBracket + 1, endBracket));  // extract the index between brackets

            if (index < 0 || index >= records.size()) {
                System.out.println("Index out of range.");
                return;
            }

            Record r = records.get(index);

            if (field.equals("address")) {
                System.out.println(r.address);
            } else if (field.equals("name")) {
                System.out.println(r.name);
            } else if (field.equals("id")) {
                System.out.println(r.id);
            } else {
                System.out.println("Unknown field: " + field);
            }
        } catch (Exception e) {
            System.out.println("Error processing indexed query.");
        }
    }
    private static void equalOperator(String query) {

        int equalIndex = query.indexOf('=');
        if (equalIndex == -1) {
            System.out.println("Invalid equality query.");  //check format
            return;
        }
        // person/field
        String left = query.substring(0, equalIndex).trim();
        // value
        String right = query.substring(equalIndex + 1).trim();



        int slashIndex = left.indexOf('/');
        if (slashIndex == -1) {
            System.out.println("Invalid field format.");  //check format
            return;
        }

        String field = left.substring(slashIndex + 1);  // extract value between after '/'

        for (Record r : records) {
            String target = null;

            if (field.equals("address")) {
                target = r.address;
            } else if (field.equals("name")) {
                target = r.name;
            } else if (field.equals("id")) {
                target = r.id;
            }

            if (target != null && target.equals(right)) {
                System.out.println("Match: id=" + r.id + ", name=" + r.name + ", address=" + r.address);
            }
        }
    }
    }

