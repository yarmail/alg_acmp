package for_beginners.parallelepiped_0819_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        System.out.println(2 * (a * b + a * c + b * c));
        System.out.println(a * b * c);
    }
}
