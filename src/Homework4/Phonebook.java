package Homework4;

import java.util.*;

public class Phonebook {

    static void deleteNumber(Map<String, Set<Integer>> phonebook) {
        System.out.println("Please, enter a Name for deleting: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        phonebook.remove(name);
        scanner.close();
    }

    static void findPhoneNumber(Map<String, Set<Integer>> phonebook) {
        System.out.println("Please, enter a Name for searching a phone number: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Set<Integer> value = phonebook.get(name);
        System.out.println(value);
        scanner.close();
    }

    static void addPhoneNumber(Map<String, Set<Integer>> phoneBook) {
        System.out.println("Please, enter a Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please, enter a Phone:");
        int number = scanner.nextInt();
        scanner.close();
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(number);
        phoneBook.put(name, numbers);
    }


}
