public class Map {
    private Room starterRoom;

    //toString maybe, if there is time
    // 9 instances of rooms, with established connections, designated room 1 to the starter room
    public void mapCreator() {
        Room room1 = new Room("Room 1,", "You find yourself at the entrance to a tomb. There are two doors.");
        Room room2 = new Room("Room 2,", "You enter a maze. The light is dim.");
        Room room3 = new Room("Room 3,", "You're in a basement with different torture instruments. In the back, there is a door.");
        Room room4 = new Room("Room 4,", "You're in a big library, lit by candles");
        Room room5 = new Room("Room 5,", "You enter a large dinning hall. lots of broke corpses laying around.");
        Room room6 = new Room("Room 6,", "You go down a few steps, and step on a crunchy bone. It looks like a mass grave.");
        Room room7 = new Room("Room 7,", "You're in a slim foyer. There's a latch visible. ");
        Room room8 = new Room("Room 8,", "the kitchen, rotten meat everywhere and a boiling pot on one of the stoves, you have a very bad feeling");
        Room room9 = new Room("Room 9,", "You're in a big laboratory. You hear screaming coming from the walls");

        //item
        Item apple = new Consumables("Apple", "A good looking apple, how and why?", 10);
        Item bandages = new Consumables("bandages", "bandages, might be useful", 25);
        Item crackers = new Consumables("crackers", "a pack of dry crackers, better than nothing", 5);
        Item meat = new Consumables("meat", "spoiled meat infested with maggots", -10);
        Item rations = new Consumables("rations", "field rations, next to a dead corpse in a uniform", 15);
        Item rustySword = new MeleWeapons("rustySword", "an old rusty sword", 15);

        // room 1
        room1.setEast(room2);
        room1.setSouth(room4);
        //items
        room1.addItemInRoom(new Item("torch", "A long thick torch"));
        room1.addItemInRoom(apple);
        room1.addItemInRoom(new MeleWeapons("pipe", "a long rusty pipe you can use to hit with", 5));
        room1.addItemInRoom(new RangedWeapons("stone", "test stone", 5, 2));
        room1.addEnemy(new Enemy("test", "testunit", 10, new MeleWeapons("sword", "little sword", 10), room2, 2));

        // room 2
        room2.setEast(room3);
        room2.setWest(room1);
        //items
        room2.addItemInRoom(bandages);
        room2.addItemInRoom(new Item("coin", "a weird looking silver coin, looks roman"));
        room2.addItemInRoom(new Consumables("poison", "its poison", -10));
        room2.addEnemy(new Enemy("skeleton", "a half broken skeleton, look weak enough", 10,
                new MeleWeapons("rustySword", "an old rusty sword", 15), room2,2));

        // room 3
        room3.setWest(room2);
        room3.setSouth(room6);
        //items
        room3.addItemInRoom(new MeleWeapons("knife", "a dull knife with a rusty blade", 7));
        room3.addItemInRoom(new RangedWeapons("LugerPistol", "a old rusty pistol", 10, 5));
        room3.addItemInRoom(rations);

        // room 4
        room4.setNorth(room1);
        room4.setSouth(room7);
        //items
        room4.addItemInRoom(bandages);
        room4.addItemInRoom(meat);
        room4.addItemInRoom(new MeleWeapons("mace", "an iron mace good for hitting thins", 10));

        // room 5
        room5.setSouth(room8);
        //items
        room5.addItemInRoom(apple);
        room5.addItemInRoom(new Item("GoldenApple", "a gold apple"));

        // room 6
        room6.setNorth(room3);
        room6.setSouth(room9);
        //items
        room6.addItemInRoom(new MeleWeapons("Axe", "a iron giant axe", 10));
        room6.addItemInRoom(meat);

        // room 7
        room7.setNorth(room4);
        room7.setEast(room8);
        //items
        room7.addItemInRoom(apple);
        room7.addItemInRoom(crackers);
        room7.addItemInRoom(new RangedWeapons("Webley", "a Webley pistol", 15, 10));
        room7.addItemInRoom(new Item("photograph", "a photo of a young man in a uniform"));
        room7.addItemInRoom(rations);

        // room 8
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        //items
        room8.addItemInRoom(meat);
        room8.addItemInRoom(meat);
        room8.addItemInRoom(meat);
        room8.addItemInRoom(meat);
        room8.addItemInRoom(meat);
        room8.addItemInRoom(meat);
        room8.addItemInRoom(new MeleWeapons("MeatClever", "a giant Meat clever", 25));

        // room 9
        room9.setNorth(room6);
        room9.setWest(room8);
        //items
        room9.addItemInRoom(new MeleWeapons("Sword", "an elegant silver sword", 20));
        room9.addItemInRoom(new RangedWeapons("TrenchGun", "a Trench gun, a powerful gun", 40, 2));
        room9.addItemInRoom(bandages);


        //the starter room
        starterRoom = room1;

    }
    public Room getStarterRoom() {
        return starterRoom;
    }}