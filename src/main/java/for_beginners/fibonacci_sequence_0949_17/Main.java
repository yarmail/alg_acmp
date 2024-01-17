package for_beginners.fibonacci_sequence_0949_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество членов последовательности
        int a1 = sc.nextInt(); // n член
        int a2 = sc.nextInt(); // n + 1 член
        int k;
        for (int i = 0; i < n - 1; i++) {
            k = a2 - a1;
            a2 = a1;
            a1 = k;
        }
        System.out.println(a1);
        System.out.println(a2);
    }
}
/* Примечания
Каждый член последовательности (начиная с третьего) равен сумме двух предыдущих
 */