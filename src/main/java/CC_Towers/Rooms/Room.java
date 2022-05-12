package CC_Towers.Rooms;
import CC_Towers.Guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> collection;

    public Room(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getCollection() {
        return collection;
    }

    public int guestCount(){
        return collection.size();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addGuest(Guest guest){
        if (collection.size() < capacity) {
            collection.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        collection.remove(guest);
    }

}
