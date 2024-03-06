import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    public Player (Room currentRoom){
        this.currentRoom = currentRoom;
    }
    

    public void goNorth(){
        if (currentRoom.getNorth() !=null){
            currentRoom = currentRoom.getNorth();
            System.out.println("going north");
            currentRoomPrint();
        } else {
            notPossible();
        }
    }
    public void goSouth(){
        if (currentRoom.getSouth() !=null){
            currentRoom = currentRoom.getSouth();
            System.out.println("going south");
            currentRoomPrint();
        } else {
            notPossible();
        }
    }
    public void goEast(){
        if (currentRoom.getEast() !=null){
            currentRoom = currentRoom.getEast();
            System.out.println("going east");
            currentRoomPrint();
        } else {
            notPossible();
        }
    }
    public void goWest(){
        if (currentRoom.getWest() !=null){
            currentRoom = currentRoom.getWest();
            System.out.println("going west");
            currentRoomPrint();
        } else {
            notPossible();
        }
    }
    public void currentRoomPrint() {
        System.out.println(currentRoom.getName() + " " + currentRoom.getDescription());
    }

    public void notPossible() {
        System.out.println("You cannot go there");
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
}
