import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    DiningRoom diningRoom;

    @Before
    public void before (){
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.DOUBLE, 2, 20.00);
        conferenceRoom = new ConferenceRoom("Meeting Room", 10);
        guest = new Guest("Bob");
        diningRoom = new DiningRoom("Bar", 50);

    }

    @Test
    public void canAddBedroom() {
        hotel.addBedrooms(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRooms(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void guestCanCheckIn(){
        hotel.checkIn(guest, bedroom);
        assertEquals(1, bedroom.getGuestsInRoom());

    }
    @Test
    public void guestCantCheckIn(){

        hotel.checkIn(guest, bedroom);
        hotel.checkIn(guest, bedroom);

        assertEquals(1, bedroom.getGuestsInRoom());

    }



    @Test
    public void guestCanCheckOut(){
        hotel.checkIn(guest, bedroom);
        hotel.checkIn(guest, bedroom);
        hotel.checkOut(guest, bedroom);
        assertEquals(1, bedroom.getGuestsInRoom());
    }

    @Test
    public void canBookBedroom(){
        Booking booking = hotel.bookRoom(bedroom, 4);
        assertEquals(bedroom, booking.getBedroom());
        assertEquals(4, booking.getNumberOfNights());
    }

    @Test
    public void canGetBill(){
        Booking booking = hotel.bookRoom(bedroom, 5);
        double bill = hotel.totalBill(booking);
        assertEquals(100, bill, 00 );
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void onlyAddsEmptyRoomsToEmptyRoomList(){
        Bedroom bedroom2 = new Bedroom(RoomType.SINGLE, 4, 15);
        bedroom2.addGuest(guest);
        hotel.addBedrooms(bedroom);
        hotel.addBedrooms(bedroom2);
        ArrayList<Bedroom> emptyRooms = hotel.getEmptyBedrooms();
        assertEquals(1, emptyRooms.size());

    }

}
