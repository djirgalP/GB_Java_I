package Homework4;

import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        HashMap<String, Set<Integer>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, chose one of the operations: \n 1 - Add contact\n 2 - Find contact\n 3 - Delete contact\n");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Please, addNumber(phoneBook) " + operation);
                break;
            case 2:
                System.out.println("Please, findNumber(phoneBook) " + operation);
                break;
            case 3:
                System.out.println("Please, deleteNumber(phoneBook) " + operation);
                break;
            default:
                System.out.println("Oooops, something wrong !");
        }
        scanner.close();
    }
}
