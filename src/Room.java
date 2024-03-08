import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private ArrayList<Item> itemList = new ArrayList<>();

    // Adds name and descriptions to new rooms
    public Room(String name, String description) {
        this.name = name;
        this.description = description;

    }

    //setters so I can set the value, and getters, so we can retrieve the value.
    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }
    public Item searchItemRoom(String shortName) {
        for (Item item : itemList) {
            if (item.getShortName().toLowerCase().equals(shortName.toLowerCase())) {
                return item;
            }
        }
        return null;
    }

    public void removeItem(String shortName) {
        Item itemToRemove = searchItemRoom(shortName);
        itemList.remove(itemToRemove);
    }

}

