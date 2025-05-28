public class Record {
    String name;
    String id;
    String address;

    Record(String name,String address,String id) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", ID: " + id;
    }
}
