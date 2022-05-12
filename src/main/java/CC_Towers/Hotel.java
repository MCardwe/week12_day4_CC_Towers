package CC_Towers;

import CC_Towers.Guests.Guest;
import CC_Towers.Rooms.Bedroom;
import CC_Towers.Rooms.ConferenceRoom;
import CC_Towers.Rooms.DiningRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedroomCollection;
    private ArrayList<ConferenceRoom> conferenceRoomCollection;
    private HashMap<String, DiningRoom> diningRoomCollection;

    public Hotel(){
        bedroomCollection = new ArrayList<>();
        conferenceRoomCollection = new ArrayList<>();
        diningRoomCollection = new HashMap<>();
    }

    public int bedroomCount() {
        return bedroomCollection.size();
    }

    public ArrayList<Bedroom> getBedroomCollection(){
        return bedroomCollection;
    }

    public int conferenceRoomCount() {
        return conferenceRoomCollection.size();
    }

    public void addBedroom(Bedroom bedroom) {
        bedroomCollection.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRoomCollection.add(conferenceRoom);
    }

    public void addGuestToBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void addGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking;
        return booking = new Booking(bedroom, numberOfNights);
    }


    public int diningRoomCount() {
        return diningRoomCollection.size();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRoomCollection.put(diningRoom.getName(), diningRoom);
    }

    public ArrayList<Bedroom> vacantBedrooms() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<>();
        for (Bedroom bedroom : bedroomCollection){
            if (bedroom.guestCount() == 0) {
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }
}
