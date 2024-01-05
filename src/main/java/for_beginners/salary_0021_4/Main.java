package for_beginners.salary_0021_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // первая заплата
        int b = scanner.nextInt(); // вторая заплата
        int c = scanner.nextInt(); // третья заплата
        int [] arr = {a, b, c};
        Arrays.sort(arr);
        System.out.println(arr[2] - arr[0]);
    }
}