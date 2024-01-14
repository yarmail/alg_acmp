package for_beginners.heron_0850_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // число Пети
        int b = sc.nextInt(); // число Маши

        System.out.println(Math.max(a, b) / 2 + Math.max(a, b) % 2); // минимум
        System.out.println(Math.min(a, b)); // максимальное количество цапель
    }
}

/* Примечание
Максимум
Из чисел 3 и 4 предполагаем что максимальное количество цапель,
которые стояли на 1 ноге = 3, поэтому максимум.

Минимум
Предположим что все цапли максимально хотели стоять на 2-х ногах
Если это число четное то решение будет: число /2
Если это число нечетное то решене будет: число /2 + 1
 */