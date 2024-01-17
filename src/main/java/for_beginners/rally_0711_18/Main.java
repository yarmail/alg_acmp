package for_beginners.rally_0711_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество участников
        int m  = sc.nextInt(); // количество кругов
        String[] u = new String[n]; //хранение имен участников
        int[] result  = new int[n]; //хранение результатов
        for (int i = 0; i < n; i++) {
            u[i] = sc.next();
            for (int j = 0; j < m; j++) {
                result[i] += sc.nextInt();
            }
        }

        int place = result[0]; //место
        int index = 0; // индекс места
        for (int i = 1; i < n; i++) {
            if (result[i] < place) {
                place = result[i];
                index = i;
            }
        }
        System.out.println(u[index]);
    }
}