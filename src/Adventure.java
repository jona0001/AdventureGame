public class Adventure {
    //Controller
    private Player player;
    private Map map = new Map();
    private Music music;

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


    public void getCurrentRoomPrint() {
        player.currentRoomPrint();
    }

    public Item getaddPlayerItem(String itemName) {
        return player.pickedItem(itemName);
    }

    public Item getdropPlayerItem(String itemName) {
        return player.dropItem(itemName);
    }

    public void printItemList() {
        getCurrentRoom().printRoomItemList();
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    public String getEat (String itemName){
        return player.eat(itemName);
    }
    public String getEquipWeapon (String itemName){
        return player.equipWeapon(itemName);
    }

    public void getMyMusic(){
        music.myMusic();
    }
    public void getPlayMusic(){
        music.playMusic();
    }
    public void getStop(){
        music.stopMusic();
    }

}
