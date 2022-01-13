import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Bar", 50);
    }

    @Test
    public void hasGuestsInRoom() {
        assertEquals(0, diningRoom.getGuestsInRoom());
    }

    @Test
    public void canGetName() {
        assertEquals("Bar", diningRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(50, diningRoom.getCapacity());
    }



}
