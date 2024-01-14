package sorting_and_sequences.statistics_0005_90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество элементов массива
        List<Integer> even = new ArrayList<>(); // собираем четные
        List<Integer> odd = new ArrayList<>();//собираем нечетные
        for (int i = 0; i < n; i++) {
            int date = sc.nextInt();
            if (date % 2 == 0) even.add(date);
            else odd.add(date);
        }
        odd.stream().forEach(System.out::println);
        even.stream().forEach(System.out::println);
        if(even.size() >= odd.size()) System.out.println("YES");
        else System.out.println("NO");
    }
}