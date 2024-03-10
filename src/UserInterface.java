import java.util.Scanner;

public class UserInterface {
    //our scanner and other attributes
    private Scanner scanner;
    private Adventure adventure;
    private boolean isRunning;
    private Item item;
    boolean inGameSession = false;

    //constructor Set the initial value for the class attributes.
    public UserInterface() {
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        adventure = new Adventure();
        isRunning = true;

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
                case "look" -> {
                    adventure.getCurrentRoomPrint();
                }
                case "inventory" -> {
                    System.out.println(adventure.getPlayer().getInventory());
                }
                case "exit" -> {
                    System.exit(0);
                }
            }
        }
        if (commands.length == 2) {
            switch (commands[0]) {
                case "take" -> {
                    Item takeItem = adventure.getaddPlayerItem(commands[1]);
                    if (takeItem != null) {
                        System.out.println("You picked up " + takeItem);
                    } else System.out.println("There is no ");
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
                default -> System.out.println("\nInvalid input, type 'help' for list of commands");
            }

        }

    }

    //start program - menu to the user


    public void introduction() {
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


    public void menuText() {
        System.out.println("***** Menu *****");
        System.out.println("Type 'Look' to look around");
        System.out.println("Type 'go' <direction> to move");
        System.out.println("Type take <item> to pick up an item");
        System.out.println("Type 'Help' or 'H' to see all controls");
        System.out.println("Type 'Exit' to exit game");
    }

    public void exit() {
        System.out.println("Exiting game, thanks for playing...");
        inGameSession = false;
    }


}

