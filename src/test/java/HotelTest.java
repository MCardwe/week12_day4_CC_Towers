import CC_Towers.Booking;
import CC_Towers.Guests.Guest;
import CC_Towers.Hotel;
import CC_Towers.Rooms.Bedroom;
import CC_Towers.Rooms.ConferenceRoom;
import CC_Towers.Rooms.DiningRoom;
import CC_Towers.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    DiningRoom diningRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(10, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("The Room", RoomType.CONFERENCE);
        guest = new Guest("Sofia");
        diningRoom = new DiningRoom("Dining Room 1", RoomType.DININGROOM);
    }

    @Test
    public void bedroomCollectionStartsEmpty(){
        assertEquals(0, hotel.bedroomCount());
    }
    @Test
    public void conferenceRoomCollectionStartsEmpty(){
        assertEquals(0, hotel.conferenceRoomCount());
    }
    @Test
    public void canAddBedRoomToHotel(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.bedroomCount());
    }
    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }
    @Test
    public void canCheckInGuestBed(){
        hotel.addGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canCheckInGuestConference(){
        hotel.addGuestToConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedroom, 3);
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void canGetTotalPrice(){
        Booking booking = hotel.bookRoom(bedroom, 3);
        assertEquals(120, booking.totalBill(), 0.0);
    }

    @Test
    public void diningRoomCollectionStartsEmpty(){
        assertEquals(0, hotel.diningRoomCount());
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.diningRoomCount());
    }

    @Test
    public void canReturnCollectionOfVacantBedrooms(){
        Bedroom bedroom1 = new Bedroom(11, RoomType.TRIPLE);
        Bedroom bedroom2 = new Bedroom(12, RoomType.DOUBLE);
        Bedroom bedroom3 = new Bedroom(13, RoomType.SINGLE);
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom2);
        hotel.addGuestToBedroom(bedroom2, guest);
        assertEquals(2, hotel.vacantBedrooms().size());
    }
}
