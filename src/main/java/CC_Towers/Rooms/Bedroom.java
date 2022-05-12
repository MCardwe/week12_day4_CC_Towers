package CC_Towers.Rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    public Bedroom(int roomNumber, RoomType roomType){
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = roomType.getPrice();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return nightlyRate;
    }
}
