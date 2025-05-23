public class Record {
    String name;
    String id;
    String address;

    Record(String name,String address,String id) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }
}
