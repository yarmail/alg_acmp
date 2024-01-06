package for_beginners.repair_0697_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt(); // длина
        int w = scanner.nextInt(); // ширина
        int h = scanner.nextInt(); // высота
        int s = 2 * h * (w + l);
        if (s < 16) System.out.println(1);
        else {
            if (s % 16 == 0) System.out.println( s / 16);
            else System.out.println(s / 16 + 1);
        }
    }
}