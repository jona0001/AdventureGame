public class Adventure {
    String look;
    private Room starterRoom;

    public Adventure() {
        mapCreator();
    }

    public void mapCreator() {
        Room room1 = new Room("entrance of the tomb", "you find yourself at the entrance");
        Room room2 = new Room("Maze", "2");
        Room room3 = new Room("Torture Chamber", "2");
        Room room4 = new Room("Library", "2");
        Room room5 = new Room("Gallery", "2");
        Room room6 = new Room("mass grave", "2");
        Room room7 = new Room("Foyer", "2");
        Room room8 = new Room("Eating hall", "2");
        Room room9 = new Room("Laboratory", "2");

        // room 1
        room1.setNorth(null);
        room1.setEast(room2);
        room1.setWest(null);
        room1.setSouth(room4);

        // room 2
        room2.setNorth(null);
        room2.setEast(room3);
        room2.setWest(room1);
        room2.setSouth(null);

        // room 3
        room3.setNorth(null);
        room3.setEast(null);
        room3.setWest(room2);
        room3.setSouth(room6);

        // room 4
        room4.setNorth(room1);
        room4.setEast(null);
        room4.setWest(null);
        room4.setSouth(room7);

        // room 5
        room5.setNorth(null);
        room5.setEast(null);
        room5.setWest(null);
        room5.setSouth(room8);

        // room 6
        room6.setNorth(room3);
        room6.setEast(null);
        room6.setWest(null);
        room6.setSouth(room9);

        // room 7
        room7.setNorth(room4);
        room7.setEast(room8);
        room7.setWest(null);
        room7.setSouth(null);

        // room 8
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room8.setSouth(null);

        // room 9
        room9.setNorth(room6);
        room9.setEast(null);
        room9.setWest(room8);
        room9.setSouth(null);
    }

    public void currentRoom(String look) {
        this.look = look;

        if (look.contains("look")) {
            System.out.println("looking around");
            System.out.println("you see");

        }
    }
    public Room getStarterRoom() {
        return starterRoom;
    }











}

