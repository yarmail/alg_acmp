package for_beginners.turn_0149_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество чисел
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr [i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}