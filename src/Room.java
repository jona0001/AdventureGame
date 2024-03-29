import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private ArrayList<Item> roomItemList = new ArrayList<>();
    private ArrayList<Enemy> enemyList = new ArrayList<>();

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

    public void addItemInRoom(Item item) {
        roomItemList.add(item);
    }
    public Item searchItemRoom(String itemName) {
        if (itemName == null)
            return null;

        for (Item item : roomItemList) {
            if (item.getItemName().toLowerCase().equals(itemName.toLowerCase())) {
                return item;
            }
        }
        return null;
    }

    public Item removeRoomItem(String itemName) {
        Item itemToRemove = searchItemRoom(itemName);
        roomItemList.remove(itemToRemove);
        return itemToRemove;
    }


    public String toString() {
        return "Room{name='" + name + "', description='" + description + "'}";
    }
    public void addEnemy (Enemy enemy) {
        enemyList.add(enemy);
    }

    public ArrayList<Enemy> getEnemyList() {
        return enemyList;
    }

    public ArrayList<Item> getRoomItemList() {
        return roomItemList;
    }
    public void printItemlist() {
        for (Item item : roomItemList) {
            System.out.println(item);
        }
    }
    public void printEnemyList() {
        for (Enemy enemy : enemyList) {
            System.out.println(enemy);
        }
    }

}

