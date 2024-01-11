package for_beginners.known_everybody_0839_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (string.contains("0")) System.out.println("NO");
        else System.out.println("YES");
    }
}