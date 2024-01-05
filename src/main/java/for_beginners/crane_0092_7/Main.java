package for_beginners.crane_0092_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt(); // общее количество журавликов
        int sum2 = sum / 3; //сделали Петя и Сережа вместе
        int k = sum - sum2; //сделала Катя
        int p = sum2 / 2; // сделал Петя
        int s = p; //сделал Сережа
        System.out.println(p + "\n" + k + "\n" + s);
    }
}