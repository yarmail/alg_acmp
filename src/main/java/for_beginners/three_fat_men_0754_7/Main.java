package for_beginners.three_fat_men_0754_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        if (m1 < 94 || m1 > 727) {
            System.out.println("Error");
            return;
        }
        if (m2 < 94 || m2 > 727) {
            System.out.println("Error");
            return;
        }
        if (m3 < 94 || m3 > 727) {
            System.out.println("Error");
            return;
        }
        if (m1 < m2) m1 = m2;
        if (m1 < m3) m1 = m3;
        System.out.println(m1);
    }
}
