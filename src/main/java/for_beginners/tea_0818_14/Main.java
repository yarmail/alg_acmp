package for_beginners.tea_0818_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество тройников
        int sum = 1;
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            sum = sum + k -1;
        }
        System.out.println(sum);
    }
}