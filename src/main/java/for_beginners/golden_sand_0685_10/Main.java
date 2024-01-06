package for_beginners.golden_sand_0685_10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();
        int [] arrA = {a1, a2, a3};
        int [] arrB = {b1, b2, b3};
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int sum = arrA[0]*arrB[0] + arrA[1]*arrB[1] + arrA[2]*arrB[2];
        System.out.println(sum);
    }
}