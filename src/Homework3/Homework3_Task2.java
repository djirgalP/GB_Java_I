package Homework3;
/*ѕусть дан произвольный список целых чисел, удалить из него четные числа*/

import java.util.*;

import static jdk.vm.ci.code.CodeUtil.isEven;

public class Homework3_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("«адайте длину списка: ");
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++) list.add(random.nextInt(0, 100));
        for (int i : list)  System.out.print(i + " ");
        System.out.println();
        Iterator iterList = list.iterator();
        System.out.println(list);
        while (iterList.hasNext()) {
            if (isEven((int) iterList.next()))
                iterList.remove();
        }
        System.out.println(list);
        for (int i : list)  System.out.print(i + " ");
        System.out.println();
        scanner.close();


    }
}
