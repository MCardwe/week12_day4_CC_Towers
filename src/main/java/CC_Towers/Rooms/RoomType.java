package CC_Towers.Rooms;

public enum RoomType {
    SINGLE(1, 25),
    DOUBLE(2, 40),
    TRIPLE(3, 60),
    FAMILY(5, 80),
    CONFERENCE(11, 300),
    DININGROOM(50, 1000);


    private final int capacity;
    private final double price;

    RoomType(int capacity, double price) {
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice(){
        return price;
    }

}
