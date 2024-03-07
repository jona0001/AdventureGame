import java.util.Scanner;

public class UserInterface {
    //our scanner and other attributes
    private Scanner scanner;
    private Adventure adventure;
    private Player player;
    private boolean isRunning;

    //constructor Set the initial value for the class attributes.
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.scanner.useDelimiter("\n");
        this.adventure = new Adventure();
        this.isRunning = true;
        this.player = this.adventure.getPlayer();
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
                case "move", "m":
                    move();
                    break;
                case "look", "l":
                    player.currentRoomPrint();
                    break;
                case "help", "h":
                    menuText();
                default:
                    System.out.println("Invalid command. Type 'Help' for a list of commands.");
            }
        }
    }
    //movement packaged.
    public void move() {
        System.out.println("Enter direction (North, South, East, West, N, S, E, W): ");
        String input = scanner.next();
        player.move(input);
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
