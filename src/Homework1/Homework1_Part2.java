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
        if ((number <= 3))
            return true;

        int sqrtN = (int) Math.round(Math.sqrt(number));
        int counter = 1;
        for (int i = 2; i <= sqrtN; i++) {
            if ((number % i) == 0) {
                counter++;
            }
            if (counter == 2) {
                break;
            }
        }
        if (counter >= 2){
            return false;
        } else {
            return true;
        }
    }
}
