package for_beginners.mouse_0907_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt(); //ширина
        int h = scanner.nextInt(); //высота
        int r = scanner.nextInt(); //радиус
        if (r * 2 <= w && r * 2 <= h) System.out.println("YES");
        else System.out.println("NO");
    }
}