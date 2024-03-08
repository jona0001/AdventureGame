import java.util.Scanner;

public class UserInterface {
    //our scanner and other attributes
    private Scanner scanner;
    private Adventure adventure;
    private boolean isRunning;
    private Item item;

    //constructor Set the initial value for the class attributes.
    public UserInterface() {
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        adventure = new Adventure();
        isRunning = true;

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



    public void userInput() {
        String input = scanner.nextLine().trim().toLowerCase();
        String[] commands = input.split("\\s+");
        String command = commands[0];


        if (commands.length == 1) {
            switch (command) {
                //->
                case "help", "h" -> {
                    System.out.println("Commands:");


                }
                case "look" -> {
                    adventure.getCurrentRoomPrint();

                }
                case "inventory" -> {
                    System.out.println(adventure.getPlayer().getInventory());
                }
            }
        }
        if (commands.length == 2)
            switch (commands[0]) {
             case "take" ->{


            Item takeItem = adventure.getaddPlayerItem(commands[1]);
            if (takeItem != null){
                System.out.println("You picked up "+ takeItem);
            }else System.out.println("There is no ");
            }}

    }

    //take item




}

