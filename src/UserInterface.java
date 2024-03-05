import java.util.Scanner;

public class UserInterface {
    private Adventure adventure;
    Scanner scanner = new Scanner(System.in);

    public UserInterface() {
        adventure = new Adventure();
        scanner.useDelimiter("\n");
    }

    public void startProgram() {
    }

    public void navigate() {
        String input = scanner.nextLine();
        switch(input){
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
        System.out.println("Type 'help' for full list of commands");
        System.out.println("▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔\n");
        System.out.println("you find yourself at the entrance of a Dark tomb, you dont remember anything");
    }

    public void menuText() {
        System.out.println("***** Menu *****");
        System.out.println("1. look around");
        System.out.println("2: go north");
        System.out.println("3: go east");
        System.out.println("4: go South");
        System.out.println("5: go West");
        System.out.println("6: help");
        System.out.println("7: Exit room");
        System.out.println("7: Exit room");
        System.out.println("9: Exit game");
    }

}