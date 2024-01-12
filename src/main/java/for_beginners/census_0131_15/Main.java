package for_beginners.census_0131_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество жильцов
        int result = -1;
        int oldest = 0; // самый старый
        for (int i = 1; i <= n; i++) {
            int v = scanner.nextInt(); // возраст человека
            int s = scanner.nextInt(); // пол человека
            if (s == 1 && v > oldest) {
                oldest = v;
                result = i;
            }
        }
        System.out.println(result);
    }
}