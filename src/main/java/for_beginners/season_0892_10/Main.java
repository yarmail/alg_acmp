package for_beginners.season_0892_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 3 && n <= 5) System.out.println("Spring");
        if (n >= 6 && n <= 8) System.out.println("Summer");
        if (n >= 9 && n <= 11) System.out.println("Autumn");
        if (n == 12 || n == 1 || n == 2) System.out.println("Winter");
        if (n < 1 || n > 12) System.out.println("Error");
    }
}