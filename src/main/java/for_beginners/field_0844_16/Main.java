package for_beginners.field_0844_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = (long) Math.sqrt(a * b); // целое значение квадрата
        if (x * x == a * b) System.out.println(x);
        else System.out.println(0);
    }
}