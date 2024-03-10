import java.util.ArrayList;

public class Player {
    //***ATTRIBUTES**
    private Room currentRoom;
    private ArrayList<Item> inventory;


    //***CONSTRUCTOR***
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        //player inventory
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

    public Item searchItemInventory(String shortName) {
        for (Item item : inventory) {
            if (item.getItemName().equalsIgnoreCase(shortName)) {
                return item;
            }
        }
        return null;
    }

    public Item addPlayerItem(String itemName) {
      Item pickedItem = getCurrentRoom().removeRoomItem(itemName);
      currentRoom.addItemInRoom(pickedItem);
      return pickedItem;
    }

    public Item dropPlayerItem(String shortName) {
        Item itemToDrop = searchItemInventory(shortName);
        inventory.remove(itemToDrop);
        return itemToDrop;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }


}

