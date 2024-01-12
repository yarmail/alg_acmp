package arithmetic.nod_0148_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a != 0 && b != 0) {
            if (a > b) a %= b;
            else b %= a;
        }
        System.out.println(a + b);
    }
}