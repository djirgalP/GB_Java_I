package Homework1;

import java.text.*;
import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number -> ");
        int N = scanner.nextInt();
        System.out.println("Triangular number = " + getTriangularNumber(N));
        System.out.println("Factorial = " + getFactorialNumber(N));

    }

    public static int getTriangularNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getFactorialNumber(int number) {
        int multiply = 1;
        for (int i = 1; i <= number; i++) {
            multiply *= i;
        }
        return multiply;
    }


}
