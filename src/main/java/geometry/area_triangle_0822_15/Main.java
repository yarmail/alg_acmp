package geometry.area_triangle_0822_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double c = Math.sqrt((y1 - y2) * (y1 - y2) + (x1 - x2) * (x1 - x2));
        double a = Math.sqrt((y2 - y3) * (y2 - y3) + (x2 - x3) * (x2 - x3));
        double b = Math.sqrt((y1 - y3) * (y1 - y3) + (x1 - x3) * (x1 - x3));

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }
}
/* Примечание
Решение вроде правильное, но выдает ошибку
Presentation error	8 тест
т.е. как я понимаю, неправильное представление числа
как победить - не знаю

 */