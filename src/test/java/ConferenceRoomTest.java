import CC_Towers.Guests.Guest;
import CC_Towers.Rooms.ConferenceRoom;
import CC_Towers.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Adam Smith", RoomType.CONFERENCE);
        guest = new Guest("Max");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(11, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Adam Smith", conferenceRoom.getName());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }
    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.guestCount());
    }
}
