import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Bob");
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", guest.getName());
    }

    @Test
    public void canSetName() {
        guest.setName("Robert");
        assertEquals("Robert", guest.getName());
    }

}
