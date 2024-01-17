package for_beginners.picking_blueberries_0496_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество кустов
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        arr.add(arr.get(0));
        arr.add(arr.get(1));

        int sum = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            int a = arr.get(i) + arr.get(i+1) + arr.get(i+2);
            if (a > sum) sum = a;
        }
        System.out.println(sum);
    }
}
/* Примечание
Этот алгоритм работает за линейное от n время.
Один из способов обрабатывать то, что грядка является круглой,
использовать массив длиной n+2 и в последние два элемента
записать первые два.
 */