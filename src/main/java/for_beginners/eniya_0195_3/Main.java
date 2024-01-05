package for_beginners.eniya_0195_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // панелей
        int a = scanner.nextInt(); // сторона А
        int b = scanner.nextInt(); // сторона B
        System.out.println(n * a * b * 2);
    }
}
