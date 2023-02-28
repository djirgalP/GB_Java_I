package Homework4;

import java.util.Scanner;

public class MenuSwitchCase {
    private final Scanner scanner;

    public MenuSwitchCase(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1 - Add contact number");
        System.out.println("2 - Delete contact number");
        System.out.println("3 - Find contact");
        System.out.println("4 - Quit");
    }

    public void startMenu(Phonebook phonebook) {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Please, choose one of the operations:\n");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("Add " + key);
                        Phonebook.addPhoneNumber();
                        break;
                    case 2:
                        System.out.println("Delete " + key);
                        break;
                    case 3:
                        System.out.println("Find " + key);
                        break;
                    case 4:
                        System.out.println("Shutting down the program...");
                        break;
                    default:
                        System.out.println("You've entered incorrect menu number...\n");
                }
            } while (key != 4);
        }
    }
}
