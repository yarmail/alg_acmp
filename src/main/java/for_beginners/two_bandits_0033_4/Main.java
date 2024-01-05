package for_beginners.two_bandits_0033_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short a = scanner.nextShort(); // банки простреленные Гарри
        short b = scanner.nextShort(); // банки простреленные Ларри
        System.out.println(b - 1);
        System.out.println(a - 1);
    }
}