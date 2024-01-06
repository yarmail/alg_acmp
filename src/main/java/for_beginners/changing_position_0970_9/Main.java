package for_beginners.changing_position_0970_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        if(a1 + a2 == a3 || a1 + a3 == a2 || a2 + a3 == a1) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}

