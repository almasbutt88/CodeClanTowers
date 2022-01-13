public class Bedroom extends AbstractRoom{

    private RoomType roomType;
    private int roomNumber;
    private double nightRate;

    public Bedroom(RoomType _roomType, int _roomNumber, double _nightRate){
        this.roomType= _roomType;
        this.roomNumber = _roomNumber;
        this.nightRate = _nightRate;
    };

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getNightRate() {
        return nightRate;
    }
}
