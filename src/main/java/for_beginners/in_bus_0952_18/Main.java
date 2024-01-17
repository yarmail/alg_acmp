package for_beginners.in_bus_0952_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество взрослых
        int m = sc.nextInt(); // количество детей

        if (n == 0 & m > 0) System.out.println("Impossible");
        else if (m == 0) {
            System.out.println(n); // минимум
            System.out.println(n); // максимум
        }
        else if (n > m) {
            System.out.println(n); // минимум
            System.out.println(n + m - 1); // максимум
        } else { // n < m
            System.out.println(m); // минимум
            System.out.println(n + m - 1); // максимум
        }
    }
}