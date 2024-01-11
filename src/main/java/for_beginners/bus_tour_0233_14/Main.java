package for_beginners.bus_tour_0233_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество мостов
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int k = scanner.nextInt();
            if (k <= 437) {
                result = i;
                break;
            }
        }
        if (result == 0) System.out.println("No crash");
        else System.out.println("Crash" + " " + result);
    }
}