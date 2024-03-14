import java.util.Scanner;

public class UserInterface {
    //our scanner and other attributes
    private Scanner scanner;
    private Adventure adventure;
    private boolean isRunning;
    boolean inGameSession = false;
    Music music = new Music();



    //constructor Set the initial value for the class attributes.
    public UserInterface() {
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        adventure = new Adventure();
        isRunning = true;
        music.playMusic();
    }

    public void start() {
        while (true) {
            if (!inGameSession) {
                introduction();
                menuText();
                inGameSession = true;
            } else {
                userInput();
            }
        }
    }

    public void userInput() {
        String input = scanner.nextLine().trim().toLowerCase();
        String[] commands = input.split("\\s+");
        String command = commands[0];

        if (commands.length == 1) {
            switch (command) {
                //->
                case "help", "h" -> {
                    menuText();
                }
                case "look", "l" -> {
                    adventure.getCurrentRoomPrint();
                    adventure.printItemList();
                }
                case "inventory", "i" -> {
                    System.out.println(adventure.getPlayer().getInventory());
                }
                case "exit" -> {
                    System.exit(0);
                }
                case "mute" -> {
                    music.stopMusic();
                }
                case "resume" -> {
                    music.playMusic();
                }
            }
        }
        if (commands.length == 2) {
            switch (commands[0]) {
                case "go" -> {
                    switch (commands[1]) {
                        case "north", "n" -> {
                            adventure.goNorth();
                            adventure.getCurrentRoomPrint();
                        }
                        case "south", "s" -> {
                            adventure.goSouth();
                            adventure.getCurrentRoomPrint();
                        }
                        case "east", "e" -> {
                            adventure.goEast();
                            adventure.getCurrentRoomPrint();
                        }
                        case "west", "w" -> {
                            adventure.goWest();
                            adventure.getCurrentRoomPrint();
                        }
                    }
                }

                case "take" -> {
                    Item takeItem = adventure.getaddPlayerItem(commands[1]);
                    if (takeItem != null) {
                        System.out.println("You picked up " + takeItem );
                    } else System.out.println("There is no " + commands[1] + " in this room");
                }
                case "drop" -> {
                    Item dropItem = adventure.getdropPlayerItem(commands[1]);
                    if (dropItem != null) {
                        System.out.println("Dropped '" + dropItem + "'");
                    } else {
                        System.out.println("There is no " + commands[1] + " in your inventory");
                    }
                }
                case "eat" -> {
                    String eat = adventure.getEat(commands[1]);
                    System.out.println(eat);

                }
            }

        }

    }
    public void introduction () {
        System.out.println("hello welcome to .....");

        System.out.println(" ______               ___            _ _   _                             ");
        System.out.println("|  ___|             / _ \\          | | | | |                            ");
        System.out.println("| |_ ___  __ _ _ __/ /_\\ \\_ __   __| | |_| |_   _ _ __   __ _  ___ _ __ ");
        System.out.println("|  _/ _ \\/ _` | '__|  _  | '_ \\ / _` |  _  | | | | '_ \\ / _` |/ _ \\ '__|");
        System.out.println("| ||  __/ (_| | |  | | | | | | | (_| | | | | |_| | | | | (_| |  __/ |   ");
        System.out.println("\\_| \\___|\\__,_|_|  \\_| |_|_| |_|\\__,_\\_| |_\\__,_|_| |_|\\__, |\\___|_|   ");
        System.out.println("                                                     __/ |          ");
        System.out.println("                                                    |___/           ");

        System.out.println("This is a horror survival game");
        System.out.println("Try and survive while discover the secrets of the tomb");
        System.out.println("▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔\n");
        System.out.println("you find yourself at the entrance of a Dark tomb, you dont remember anything");
    }
    public void menuText () {
        System.out.println("Commands:");
        System.out.println("GO <direction>  - Move in the specified direction (e.g., 'go north', 'go west'). You can also use N, S, E, and W.");
        System.out.println("LOOK, L         - Take another look around the room.");
        System.out.println("TAKE <item>     - Pick up an object from a room (e.g., 'take club').");
        System.out.println("DROP <item>     - Drop an item inside a room (e.g., 'drop club').");
        System.out.println("INVENTORY, I    - View items in your inventory.");
        System.out.println("MUTE,           - to mute the music");
        System.out.println("resume          - to resume music");
        System.out.println("EXIT            - Exit the program.");
    }
}
// might add riddles in a room
//
