package two_dimensional_arrays.negative_0715_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // высота
        int m = sc.nextInt(); // ширина

        String[] map1 = new String[n];
        String[] map2 = new String[n];

        for (int i = 0; i < n; i++) {
            map1[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            map2[i] = sc.next();
        }

        int errors = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < map1[i].length(); j++) {
                if (map1[i].charAt(j) == map2[i].charAt(j)) {
                errors++;
                }
            }
        }
        System.out.println(errors);
    }
}