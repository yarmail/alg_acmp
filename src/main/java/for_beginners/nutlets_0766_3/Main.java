package for_beginners.nutlets_0766_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // шишки
        int m = scanner.nextInt(); // орешки
        int k = scanner.nextInt(); // всего орешков
        String result = null;
        if (n * m >= k) result = "YES";
        else result = "NO";
        System.out.println(result);
    }
}