package Homework3;

import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Math.round;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.*/

public class Homework3_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длину списка: ");
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>(N);

        Random random = new Random();

        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(0, 100));
        }
        for (int i : list)  System.out.print(i + " ");
        System.out.println();

        Collections.sort(list);
        double sum = 0;
        for (int i : list) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nminimal value = " + list.get(0));
        System.out.println("maximum value = " + list.get(list.size() - 1));
        DecimalFormat df2 = new DecimalFormat("###.##");        ;
        System.out.println("average value = " + df2.format(sum/N));
        scanner.close();


    }
}
