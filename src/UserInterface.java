import java.util.Scanner;

public class UserInterface {
    private Adventure adventure;
    Scanner scanner = new Scanner(System.in);

    public UserInterface() {
        adventure = new Adventure();
        scanner.useDelimiter("\n");
    }

    public void startProgram() {
        int sentinel = 9;


        while (menuChoice != sentinel){

        }
    }


    public void navigate() {
        String input = scanner.nextLine();
        switch(input){
            case "go north":
                System.out.println("Go north");
                break;
            case "go south":
                System.out.println("Go south");
                break;
            case "go west":
                System.out.println("Go west");
                break;
            case "go east":
                System.out.println("Go east");
                break;
        }

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

    }
}