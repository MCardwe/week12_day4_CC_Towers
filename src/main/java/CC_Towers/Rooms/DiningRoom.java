package CC_Towers.Rooms;

public class DiningRoom extends Room{

    private String name;
    private int capacity;
    private RoomType roomType;

    public DiningRoom(String name, RoomType roomType){
        super(roomType.getCapacity());
        this.name = name;
        this.capacity = roomType.getCapacity();
    }

    public String getName() {
        return name;
    }
}
