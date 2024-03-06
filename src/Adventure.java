public class Adventure {
    private Player player;
    private Map map = new Map();

    public Adventure() {
        map.mapCreator();
        player = new Player(map.getStarterRoom());
    }
    public void goNorth() {
        player.goNorth();
    }
    public void goSouth(){
        player.goSouth();
    }
    public void goEast(){
        player.goEast();
    }
    public void goWest(){
        player.goWest();
    }

    public Player getPlayer() {
        return player;
    }
}

