package for_beginners.alarm_0777_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt(); // лег спать
        int t = scanner.nextInt(); // поставил будильник
        if (t > s) System.out.println(t - s);
        if (s > t) System.out.println(12 + t - s);
    }
}