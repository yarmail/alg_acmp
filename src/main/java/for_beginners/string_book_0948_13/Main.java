package for_beginners.string_book_0948_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // количество строк на странице
        int n = scanner.nextInt(); // номер строки
        System.out.println(((n - 1) / k + 1) + " " + ((n - 1) % k + 1));
    }
}
/*
странно, другим способом не получилось, автомат не принял
 */