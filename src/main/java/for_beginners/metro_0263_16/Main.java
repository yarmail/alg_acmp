package for_beginners.metro_0263_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // общее количество станций
        int a = sc.nextInt(); // номер первой станции
        int b = sc.nextInt(); // номер второй станции

        if (a > b) a = a + b - (b = a); //меняем местами
        int path1 = b - a - 1;
        int path2 = n - b + a - 1;
        System.out.println(Math.min(path1, path2));
    }
}