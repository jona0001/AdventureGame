public class Adventure {
    //Controller
    private Player player;
    private Map map = new Map();

    public Adventure() {
        map.mapCreator();
        player = new Player(map.getStarterRoom());
    }

    public void goNorth() {
        player.goNorth();
    }

    public void goSouth() {
        player.goSouth();
    }

    public void goEast() {
        player.goEast();
    }

    public void goWest() {
        player.goWest();
    }

    public Player getPlayer() {
        return player;
    }


    public void getCurrentRoomPrint (){
        player.currentRoomPrint(); 
    }

    public Item getaddPlayerItem(String itemName){
        return player.addPlayerItem(itemName);
    }

    public Item getdropPlayerItem(String itemName){
        return player.dropPlayerItem(itemName);
    }
    public void printItemList() {
        getCurrentRoom().printRoomItemList();
    }
    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }









}
