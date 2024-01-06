package for_beginners.fishing_net_0756_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println((m-1)*(n-1));
    }
}

/* Примечания
Переводим узлы в квадраты.
На каждый квадрат можно делать один надрыв
 */
