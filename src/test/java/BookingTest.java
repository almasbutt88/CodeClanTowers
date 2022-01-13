import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 1, 20.00);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canGetBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void canGetNumberOfNights() {
        assertEquals(3, booking.getNumberOfNights());
    }


}
