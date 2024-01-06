package for_beginners.palindrome_0324_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        if (arr[0] == arr[3] && arr[1] == arr[2]) System.out.println("YES");
        else System.out.println("NO");
    }
}