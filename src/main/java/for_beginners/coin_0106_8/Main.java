package for_beginners.coin_0106_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // сколько монеток
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < n;  i++) {
            int k = scanner.nextInt();
            if (k == 0) count0++;
            if (k == 1) count1++;
        }
        if (count0 > count1) System.out.println(count1);
        if (count0 < count1) System.out.println(count0);
        if (count0 == count1) System.out.println(count0);
    }
}

/* Ключевой момент
надо посчитать кого меньше переворачивать орлов или решек

 */