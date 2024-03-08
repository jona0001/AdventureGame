import java.util.ArrayList;

public class Player {
    //***ATTRIBUTES**
    private Room currentRoom;
    private ArrayList<Item> inventory;


    //***CONSTRUCTOR***
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        //PLayer har inventory
        this.inventory = new ArrayList<>();
    }


    public void goNorth() {
        if (currentRoom.getNorth() == null) {
            System.out.println("This path is not available");
        } else {
            currentRoom = currentRoom.getNorth();
            System.out.println(" ");
            System.out.println("Going North");
        }
    }

    public void goSouth() {
        if (currentRoom.getSouth() == null) {
            System.out.println("This path is not available");
        } else {
            currentRoom = currentRoom.getSouth();
            System.out.println(" ");
            System.out.println("Going South");
        }
    }

    public void goWest() {
        if (currentRoom.getWest() == null) {
            System.out.println("This path is not available");
        } else {
            currentRoom = currentRoom.getWest();
            System.out.println(" ");
            System.out.println("Going West");
        }
    }

    public void goEast() {
        if (currentRoom.getEast() == null) {
            System.out.println("This path is not available");
        } else {
            currentRoom = currentRoom.getEast();
            System.out.println(" ");
            System.out.println("Going East");
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }


    //current room name and description
    public void currentRoomPrint() {
        System.out.println(currentRoom.getName() + " " + currentRoom.getDescription());
    }

    //makes the move methods work with string input.
    public void move(String input) {
        switch (input.toLowerCase()) {
            case "go north":
            case "north":
            case "n":
                goNorth();
                break;
            case "go south":
            case "south":
            case "s":
                goSouth();
                break;
            case "go west":
            case "west":
            case "w":
                goWest();
                break;
            case "go east":
            case "east":
            case "e":
                goEast();
                break;
        }
    }

    public Item searchItemInventory(String shortName) {
        for (Item item : inventory) {
            if (item.getShortName().equalsIgnoreCase(shortName)) {
                return item;
            }
        }
        return null;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(String shortName) {
        Item itemToRemove = searchItemInventory(shortName);
        inventory.remove(itemToRemove);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}

