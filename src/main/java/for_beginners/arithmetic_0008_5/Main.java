package for_beginners.arithmetic_0008_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a * b == c) System.out.println("YES");
        if (a * b != c) System.out.println("NO");
    }
}