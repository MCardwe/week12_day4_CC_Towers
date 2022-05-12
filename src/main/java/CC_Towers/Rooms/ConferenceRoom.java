package CC_Towers.Rooms;

public class ConferenceRoom extends Room {

    private String name;
    private RoomType roomType;
    private double price;


    public ConferenceRoom(String name, RoomType roomType) {
        super(roomType.getCapacity());
        this.name = name;
        this.roomType = roomType;
        this.price = roomType.getPrice();
    }

    public String getName() {
        return name;
    }

    public RoomType getRoomType() {
        return roomType;
    }


}
