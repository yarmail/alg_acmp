package for_beginners.alien_0597_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        if (r1 >= r2 + r3) System.out.println("YES");
        else System.out.println("NO");
    }
}