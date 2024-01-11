package for_beginners.conditioner_0854_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        String mode = sc.next();
        switch (mode) {
            case "freeze" -> System.out.println(Math.min(a, b));
            case "heat" -> System.out.println(Math.max(a, b));
            case "auto" -> System.out.println(b);
            case "fan" -> System.out.println(a);
        }
    }
}