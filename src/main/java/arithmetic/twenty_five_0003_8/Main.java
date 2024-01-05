package arithmetic.twenty_five_0003_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = (a - 5) / 10;
        b = b * (b + 1);
        if (b > 0) System.out.print(b);
        System.out.print("25");
    }
}
/* Примечания
1. Цитата: Здесь распространенной ошибкой также является вывод значения
в форме 100*B*(B+1)+25. Дело в том, что такая форма так же может
вызывать переполнение, т.к. конечным результатом является опять
то же самое большое число.

2. Как я понимаю можно просто решить через long возведением в квадрат.
 */

