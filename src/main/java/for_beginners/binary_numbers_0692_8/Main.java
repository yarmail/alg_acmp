package for_beginners.binary_numbers_0692_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0;
        int k = -1;
        while (m < n) {
            k++;
            m = (int) Math.pow(2, k);
        }
        if (n < 1 || m != n ) System.out.println("NO");
        else if (m == n) System.out.println("YES");
    }
}
