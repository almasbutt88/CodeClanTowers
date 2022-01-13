import java.util.ArrayList;

public abstract class AbstractRoom {

    private ArrayList<Guest> guestsInRoom;

    public AbstractRoom() {
        this.guestsInRoom = new ArrayList<>();
    }

    public int getGuestsInRoom() {
        return guestsInRoom.size();
    }

    public void addGuest(Guest _guest){
        guestsInRoom.add(_guest);
    }


    public void removeGuest(Guest _guest){
        guestsInRoom.remove(_guest);
    };
}
