package arithmetic.fibonacci_0147_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        int a = 0, b = 1;
        while (n > 1) {
            b = a + b;
            a = b - a;
            n--;
        }
        result = (n == 0) ? 0 : b;
        System.out.println(result);
    }
}