public class Room {
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public void setNorth(Room north){
        this.north = north;
    }
    public void setSouth(Room south){
        this.north = south;
    }
    public void setEast(Room east){
        this.east = east;
    }
    public void setWest(Room west){
        this.west = west;
    }



}
