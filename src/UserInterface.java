import java.util.Scanner;

public class UserInterface {
    //our scanner
    Scanner scanner = new Scanner(System.in);
    private Adventure adventure;
    private Player player;

    public UserInterface() {
        adventure = new Adventure();
        scanner.useDelimiter("\n");
    }

    public void startProgram() {
        introduction();
        menuText();
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("1")) {
                move(input);



            }
        }
    }
    public boolean move(String input) {
        switch (input.toLowerCase()) {
            case "go north":
            case "north":
            case "n":
                adventure.goNorth();
                break;
            case "go south":
            case "south":
            case "s":
                adventure.goSouth();
                break;
            case "go west":
            case "west":
            case "w":
                adventure.goWest();
                break;
            case "go east":
            case "east":
            case "e":
                adventure.goEast();
                break;
        } return true;
    }

    public void navigate() {
        String input = scanner.nextLine();
        switch (input) {
            case "go north":
                System.out.println("you went north");
                break;
            case "go south":
                System.out.println("you went south");
                break;
            case "go west":
                System.out.println("you went west");
                break;
            case "go east":
                System.out.println("you went east");
                break;
        }
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
        System.out.println("Press 1 to start a new game!");
        //System.out.println("you find yourself at the entrance of a Dark tomb, you dont remember anything");
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
        System.out.println("Type 'North' or 'N' to go north");
        System.out.println("Type 'East' or 'E' to go east");
        System.out.println("Type 'South' or 'S' to go south");
        System.out.println("Type 'West' or 'W' to go west");
        System.out.println("Type 'Help' or 'H' to see all controls");
        System.out.println("Type 'Exit' to exit game");
    }

    public void exit() {
        System.out.println("Exiting game, thanks for playing...");
    }

}