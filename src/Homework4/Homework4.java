package Homework4;

import java.util.Scanner;

public class Homework4 {

    public static Phonebook phonebook;

    public static void main(String[] args) {
        phonebook = new Phonebook();
        new MenuSwitchCase(new Scanner(System.in)).startMenu(phonebook);
    }

}
