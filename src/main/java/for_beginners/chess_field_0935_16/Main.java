package for_beginners.chess_field_0935_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if ((x1 + y1) % 2 == (x2 + y2) % 2)
            System.out.println("YES");
        else System.out.println("NO");
    }
}

/* Примечание
Если я правильно понимаю, решение тут такое:
если суммы координат четные - одного цвета,
если нет, другого
 */
