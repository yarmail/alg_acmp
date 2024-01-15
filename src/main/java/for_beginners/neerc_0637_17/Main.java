package for_beginners.neerc_0637_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // число институтов
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr [i] = sc.nextInt(); // количество команд от каждого института
        }

        int k = sc.nextInt(); // количество залов
        int result = 0;
        for (int el: arr) {
            if (el <= k) result += el;
            if (el > k) result += k;
        }
        System.out.println(result);
    }
}