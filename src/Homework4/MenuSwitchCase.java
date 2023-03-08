package Homework4;

import java.util.Scanner;

public class MenuSwitchCase {
    private final Scanner scanner;

    public MenuSwitchCase(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1 - Add phone number");
        System.out.println("2 - Delete phone number");
        System.out.println("3 - Find phone number/-s by login");
        System.out.println("4 - Quit");
    }

    public void startMenu(Phonebook phonebook) {
        if (this.scanner != null) {
            String option;
            do {
                printMenu();
                System.out.print("Please, choose one of the operations:\n");
                option = this.scanner.nextLine().toString();
                switch (option) {
                    case "1":
                        phonebook.addPhoneNumber();
                        break;
                    case "2":
                        phonebook.deleteNumber();
                        break;
                    case "3":
                        phonebook.findPhoneNumber();
                        break;
                    case "4":
                        System.out.println("Shutting down the program...");
                        break;
                    default:
                        System.out.println("You've entered incorrect menu number...\n");
                }
            } while (!option.equals("4"));
        }
    }
}
