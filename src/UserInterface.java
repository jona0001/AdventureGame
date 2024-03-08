import java.util.Scanner;

public class UserInterface {
    //our scanner and other attributes
    private Scanner scanner;
    private Adventure adventure;
    private boolean isRunning;
    private Item item;

    //constructor Set the initial value for the class attributes.
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.scanner.useDelimiter("\n"); //Så vi ikke skal bruge dummy bugs
        this.adventure = new Adventure();
        this.isRunning = true;
        this.Player = this.adventure.getPlayer();
    }

    //start program - menu to the user
    public void startProgram() {
        introduction();
        menuText();
        while (isRunning) {
            String input = scanner.next();
            switch (input.toLowerCase()) {
                case "exit":
                    exit();
                    break;
                case "move":
                    move();
                    break;
                case "look":
                    adventure.getCurrentRoomPrint();
                    break;
                case "help":
                    menuText();
                default:
                    System.out.println("Invalid command. Type 'Help' for a list of commands.");
            }
        }
    }

    //movement packaged.
    public void move() {
        System.out.println("Enter direction (North, South, East, West): ");
        String input = scanner.next();
        adventure.move(input);
    }


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

    /*public void newGame() {
        System.out.println("Press 1 to start a new game");
        int newGame = 1;
        int inputNewGame = scanner.nextInt();
        if (inputNewGame == newGame) {
            System.out.println("You find yourself at the entrance of a Dark tomb, you dont remember anything");
        } else {
            System.out.println("Please enter 1 to start new game\"");
        }
    }*/

    //Split metode med UI
    public void userInput() {
        String input = scanner.nextLine().trim().toLowerCase();
        String[] commands = input.split("\\s+");
        String command = commands[0];


        if (commands.length == 1) {
            switch (command) {
                //-> lambda expression  og gør så der ikke skal break; på.
                case "help", "h" -> {
                    System.out.println("Commands:");
                    //Flere Help Commands

                }
                case "look" -> {
                    player.currentRoomPrint();

                }
                case "inventory" -> {
                    System.out.println(adventure.getPlayer().getInventory());
                }
            }
        }
    }

    public void menuText() {
        System.out.println("***** Menu *****");
        System.out.println("Type 'Look' to look around");
        System.out.println("Type 'move' to get move commands");
        System.out.println("Type 'Help' or 'H' to see all controls");
        System.out.println("Type 'Exit' to exit game");
    }

    public void exit() {
        System.out.println("Exiting game, thanks for playing...");
        isRunning = false;
    }

    //remove item
    public void removeItem() {
        String input = scanner.next();
        System.out.println("What do you want to remove from your inventory?");
        player.removeItem(input);
        System.out.println(takeItem + " has been removed from your inventory");
    }

    //take item


}
}
