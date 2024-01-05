package for_beginners.basketball_0061_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultA = 0;
        int resultB = 0;
        for (int i = 0; i < 4; i++) {
            int a = scanner.nextInt();
            resultA += a;
            int b = scanner.nextInt();
            resultB +=b;
        }
        if (resultA > resultB) System.out.println(1);
        if (resultA < resultB) System.out.println(2);
        if (resultA == resultB) System.out.println("DRAW");
    }
}