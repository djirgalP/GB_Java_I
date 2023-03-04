package Homework4;

import java.util.*;

public class Phonebook {
    HashMap<String, HashSet<String>> book;
    static Scanner scanner = new Scanner(System.in);

    public Phonebook() {
        book = new HashMap<>();
    }

    public void addPhoneNumber() {
        System.out.println("Please, enter a Login: ");
        String login = scanner.nextLine();
        System.out.println("Please, enter a Phone number:");
        String number = scanner.nextLine();
        HashSet<String> numbers;
        if (book.get(login) != null)
            numbers = book.get(login);
        else
            numbers = new HashSet<>();
        numbers.add(number);
        this.book.put(login, numbers);
    }

    public void deleteNumber() {
        System.out.println("Please, enter a Phone number for deleting: ");
        String number = scanner.nextLine();
        ArrayList<String> logins = this.getLogins(number);
        for (String login : logins) {
            book.get(login).remove(number);
            System.out.printf("Phone number %s was deleted for login = %s\n", number, login);
        }
        //System.out.println(book.keySet());
        for (String login : book.keySet()) {
            if (book.get(login).isEmpty()) {
                book.remove(login);
                System.out.printf("Login %s was also deleted\n", login);
            }
        }
    }

    public void findPhoneNumber() {
        System.out.println("Please, enter a Login for searching: ");
        String login = scanner.nextLine();
        ArrayList<String> numbers = this.getNumbers(login);
        if (!numbers.isEmpty())
            System.out.println("The following number/-s detected:" + numbers);
        else
            System.out.println("No number/-s were detected");
    }

    public ArrayList<String> getLogins(String number) {
        HashSet<String> numbers;
        ArrayList<String> logins = new ArrayList<>();
        for (String login : book.keySet()) {
            numbers = book.get(login);
            if (numbers.contains(number))
                logins.add(login);
        }
        return logins;
    }

    public ArrayList<String> getNumbers(String login) {
        if (book.get(login) == null) {
            return null;
        } else {
            ArrayList<String> numbers = new ArrayList<>(book.get(login));
            return numbers;
        }
    }

}
