package Homework4;

import java.util.*;

public class Phonebook {
    HashMap<String, HashSet<String>> book;

    static void addPhoneNumber() {
        System.out.println("Please, enter a Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please, enter a Phone:");
        String number = scanner.nextLine();
        scanner.close();
        HashSet<String> numbers = new HashSet<>();
        numbers.add(number);
        book.put(name, numbers);
    }

    static void deleteNumber(Phonebook book) {
        System.out.println("Please, enter a Name for deleting: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        book.remove(name);
        scanner.close();
    }

    static void findPhoneNumber(Phonebook book) {
        System.out.println("Please, enter a Name for searching a phone number: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Set<String> numbers = book.getName(name);
        System.out.println(numbers);
        scanner.close();
    }



    static void remove(String name){

    }

    static void put(String name, String numbers){
        HashSet<String> phones;
        if (book.get(login) != null) {
            phones = book.get(login);
        } else {
            phones = new HashSet<>();
        }
        phones.add(phone);
        book.put(login, phones);
    }

    static HashSet getName(String name){

    }


}
