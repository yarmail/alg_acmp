package for_beginners.state_machine_0035_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // количество конечных автоматов
        for (int i = 0; i < k; i++) {
            int n = scanner.nextInt(); // число состояний
            int m = scanner.nextInt(); // число переходов
            int d = 19 * m + (n + 239) * (n + 366) / 2;
            System.out.println(d);
        }
    }
}