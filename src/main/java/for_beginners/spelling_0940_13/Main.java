package for_beginners.spelling_0940_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // номер лишней буквы
        StringBuffer sb = new StringBuffer(scanner.next()).deleteCharAt(k-1);
        System.out.println(sb);
    }
}