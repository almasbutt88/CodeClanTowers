import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest   guest;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.FAMILY, 1, 30.00);
        guest = new Guest("Bob");
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.FAMILY, bedroom.getRoomType());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetNightRate() {
        assertEquals(30.00, bedroom.getNightRate(), 0.0);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(4, RoomType.FAMILY.getCapacity());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestsInRoom());
    }
}
