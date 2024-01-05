package for_beginners.more_less_0025_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = null;
        if (a > b) result = ">";
        if (a < b) result = "<";
        if (a == b) result = "=";
        System.out.println(result);
    }
}
