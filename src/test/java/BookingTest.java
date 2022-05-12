import CC_Towers.Booking;
import CC_Towers.Rooms.Bedroom;
import CC_Towers.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(3, RoomType.DOUBLE);
        booking = new Booking( bedroom, 5);
    }

    @Test
    public void canGetBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void canGetNumberOfNights(){
        assertEquals(5, booking.getNumberOfNights());
    }
}
