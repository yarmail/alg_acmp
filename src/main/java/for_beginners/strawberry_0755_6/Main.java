package for_beginners.strawberry_0755_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // сорвала Маша
        int y = scanner.nextInt(); // сорвал Миша
        int z = scanner.nextInt(); // возможно съели;
        if (z <= x + y) System.out.println(x + y - z);
        if (z > x + y) System.out.println("Impossible");
    }
}