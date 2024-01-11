package for_beginners.watermelon_0081_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество арбузов
        int min = 30000;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if (k > max) max = k;
            if (k < min) min = k;
        }
        System.out.println(min + " " + max);
    }
}
/*
Странно, другое решение по min max не проходило
 */