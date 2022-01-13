import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Meeting Room", 10);
    }
    @Test
    public void canGetName(){
        assertEquals("Meeting Room", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }
    
    @Test
    public void hasGuestsInRoom() {
        assertEquals(0, conferenceRoom.getGuestsInRoom());
    } // create method to add guests and then rerun test
    
}
