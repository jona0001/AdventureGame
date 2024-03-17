import java.util.ArrayList;

public class Player {

    //***ATTRIBUTES**
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health;
    private Weapon currentWeapon;
    private boolean playerisDead = false;


    //***CONSTRUCTOR***
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        this.inventory = new ArrayList<>();
        this.health = 100;
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

    public Item pickedItem(String itemName) {
        Item pickedItem = getCurrentRoom().removeRoomItem(itemName);
        if (pickedItem != null) {
            inventory.add(pickedItem);
            return pickedItem;
        } else {
            System.out.println("Item not found in room");
            return null;
        }
    }

    public Item dropItem(String itemName) {
        Item itemToDrop = searchItemInventory(itemName);
        if (itemToDrop != null) {
            inventory.remove(itemToDrop);
            return itemToDrop;
        } else {
            System.out.println("Item not found in the inventory.");
            return null;
        }
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;

    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public boolean getPlayerisDead (){
        return playerisDead;
    }

    public void isPlayerDead() {

        if (health < 1) {
            playerisDead = true;
        }
    }

    public String eat(String itemName) {
        Item item = searchItemInventory(itemName);
        if (item == null) {
            return "You don't have that item";
        } else if (item instanceof Consumables food) {
            if (health + food.getHealingPoint()>=100){
                setHealth(100);
                removeItem(food);
                return "You ate the "+itemName;
            } else{
            removeItem(food);
            health += food.getHealingPoint();
            return "You ate the " + itemName;}
        } else {

            return "Doesn't exist";
        }
    }
    public String equipWeapon (String itemName){
        Item item = searchItemInventory(itemName);
        if (item == null){
            return "you dont have that item";
        } else if (item instanceof Weapon){
            currentWeapon = (Weapon) item;
            return "you have equipped " + currentWeapon;
        }else {
            return "you cant equip " + item.getItemName();
        }
    }
    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }


}

