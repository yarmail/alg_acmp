package for_beginners.game_0004_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = 9;
        int n3 = 9 - n1;
        StringBuilder sb = new StringBuilder();
        sb.append(n1);
        sb.append(n2);
        sb.append(n3);
        System.out.println(sb);
    }
}