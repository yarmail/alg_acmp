package for_beginners.phone_0933_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // до a минут в месяц за тариф b
        int b = scanner.nextInt(); //
        int c = scanner.nextInt(); // c рублей за минуту сверх нормы
        int t = scanner.nextInt(); // т - текущее время

        if (t <= a ) System.out.println(t * b);
        if (t > a) System.out.println(a * b + (t-a) * c);
    }
}