package Homework1;

import java.text.*;
import java.util.*;

public class Homework1_Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number -> ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (isSimpleNumberCheck(i)) {
                System.out.print(i + " ");
            }
        }


    }

    public static boolean isSimpleNumberCheck(int number) {
        boolean isSimple = false;
        int counter = 2;
        if ((number == 1) || (number == 2) || (number == 3)){
            System.out.println("1st if, isSimple = " + isSimple);

            return true;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                counter++;
            }
            if (counter > 2) {

                System.out.println("2nd if, isSimple = " + isSimple);
                return false;
            }
        }
        if (counter == 2){
            return true;
        } else {
            return false;
        }
    }
}
