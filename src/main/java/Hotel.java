import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;
    private HashMap<String, DiningRoom> diningRoomList;

    public Hotel() {
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<ConferenceRoom>();
        this.diningRoomList = new HashMap<String, DiningRoom>();
        }

    public int getNumberOfBedrooms() {
        return bedroomList.size();
    }

    public int getNumberOfConferenceRooms() {
        return conferenceRoomList.size();
    }

    public int getNumberOfDiningRooms() {
        return diningRoomList.size();
    }

    public void checkIn(Guest _guest, AbstractRoom _abstractRoom){

        if(_abstractRoom.getGuestsInRoom() == 0){
            _abstractRoom.addGuest(_guest);
        }

    }

    public void checkOut(Guest _guest, AbstractRoom _abstractRoom){
        _abstractRoom.removeGuest(_guest);
    }

    public void addBedrooms(Bedroom _bedroom){
        bedroomList.add(_bedroom);
    }

    public void addConferenceRooms(ConferenceRoom _conferenceRoom){
        conferenceRoomList.add(_conferenceRoom);
    }

    public void addDiningRoom(DiningRoom _diningRoom){
        String key = _diningRoom.getName();
        diningRoomList.put(key, _diningRoom);
    }

    public Booking bookRoom(Bedroom _bedroom, int _numberOfNights){
        Booking newBooking = new Booking(_bedroom, _numberOfNights);
        return newBooking;
    }

    public double totalBill(Booking _booking){
        Bedroom bedroom = _booking.getBedroom();
        double rate = bedroom.getNightRate();
        int nights = _booking.getNumberOfNights();
        double bill = rate * nights;
        return bill;
    }

    public ArrayList<Bedroom> getEmptyBedrooms(){
        ArrayList<Bedroom> emptyBedrooms = new ArrayList<Bedroom>();
        for(Bedroom _bedroom: bedroomList){
            if(_bedroom.getGuestsInRoom() == 0){
                emptyBedrooms.add(_bedroom);
            }
        }
        return emptyBedrooms;
    }


}


