package for_beginners.cake_0539_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество гостей
        int result = -1;
        if (n == 1) result = 0;
        else if (n % 2 == 0) result = (n / 2);
        else if (n % 2 == 1) result = n;
        System.out.println(result);
    }
}
