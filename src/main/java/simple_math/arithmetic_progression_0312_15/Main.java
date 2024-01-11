package simple_math.arithmetic_progression_0312_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(a1 + (a2 - a1) * (n - 1));
    }
}