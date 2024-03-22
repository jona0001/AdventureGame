import java.util.Scanner;

public class UserInterface {
    //our scanner and other attributes
    private Scanner scanner;
    private Adventure adventure;
    boolean inGameSession = false;



    //constructor Set the initial value for the class attributes.
    public UserInterface() {
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        adventure = new Adventure();
    }

    public void start() {
        while (true) {

            if (!inGameSession) {
                introduction();
                adventure.search();
                inGameSession = true;
            }
            if (adventure.playerisDead()){
                gameOver();
            }
            if(adventure.checkFinalEnemyDefeat()){
                System.out.println("Congratulations you beat the game, you can now do whatever you want.");

            }
            else {
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
                case "look", "l", "search" -> {
                    adventure.search();
                }
                case "inventory", "i" -> {
                    System.out.println(adventure.getPlayer().getInventory());
                }
                case "exit" -> {
                    System.exit(0);
                }
                case "mute" -> {
                    adventure.getStop();
                }
                case "start" -> {
                    adventure.getPlayMusic();
                }
                case "health" -> {
                    System.out.println("You have " + adventure.getPlayer().getHealth() + " health points");
                }
                case "attack" -> {
                    adventure.getAttack();
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
                        System.out.println("You picked up " + takeItem + "'");
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
                case "use" -> {
                    String use = adventure.getEat(commands[1]);
                    System.out.println(use);
                }
                case "equip" -> {
                    String equip = adventure.getEquipWeapon(commands[1]);
                    System.out.println(equip);
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
        System.out.println("you find yourself at the entrance of a Dark tomb, you dont remember anything");
        System.out.println("you see in the room");
        System.out.println("type <help> to see commands");
        System.out.println("▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔\n");


    }
    public void menuText () {
        System.out.println("Commands:");
        System.out.println("GO <direction>  - Move in the specified direction (e.g., 'go north', 'go west'). You can also use N, S, E, and W.");
        System.out.println("LOOK, L         - Take another look around the room.");
        System.out.println("TAKE <item>     - Pick up an object from a room (e.g., 'take club').");
        System.out.println("DROP <item>     - Drop an item inside a room (e.g., 'drop club').");
        System.out.println("use <item>      - to use an healing item");
        System.out.println("equip <weapon>  - to equip a weapon");
        System.out.println("attack <enemy>  - to attack an enemy");
        System.out.println("INVENTORY, I    - View items in your inventory.");
        System.out.println("HEALTH          - See your health");
        System.out.println("Start           - start music");
        System.out.println("MUTE,           - Mute music");
        System.out.println("EXIT            - Exit the program.");
    }
    public void gameOver() {
        System.out.println("Game over, do you want to play again? (yes/no)");
        String playAgain = scanner.nextLine().trim().toLowerCase();
        if (playAgain.equals("yes")) {
            System.out.println("something");
        } else {
            inGameSession = false;
        }

    }



}

