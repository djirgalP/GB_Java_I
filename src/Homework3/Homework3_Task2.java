package Homework3;
/*ѕусть дан произвольный список целых чисел, удалить из него четные числа*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Homework3_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("«адайте длину списка: ");
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++) list.add(random.nextInt(0, 100));
        for (int i : list)  System.out.print(i + " ");
        Iterator iterableList = list.iterator();
        int chislo;
        while (iterableList.hasNext()) {
            chislo = (int)iterableList.next();
            if (chislo % 2 == 0)
                iterableList.remove();
        }
        System.out.println();
        for (int i : list)  System.out.print(i + " ");

        scanner.close();


    }
}
