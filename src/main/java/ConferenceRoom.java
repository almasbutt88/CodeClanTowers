public class ConferenceRoom extends AbstractRoom {

    private String name;
    private int capacity;

    public ConferenceRoom(String _name, int _capacity){
        this.name = _name;
        this.capacity = _capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
