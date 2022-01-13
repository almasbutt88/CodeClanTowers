public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom _bedroom, int _numberOfNights){
        this.bedroom = _bedroom;
        this.numberOfNights = _numberOfNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
}
