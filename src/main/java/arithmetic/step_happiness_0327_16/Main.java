package arithmetic.step_happiness_0327_16;

import java.util.Scanner;

public class Main {
    public static boolean isLucky(String string) {
        int[] num = string.chars().map(x -> x - '0').toArray();
        return(num[0] + num[1] + num[2] == num[3] + num[4] + num[5]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // количество тестов

        for (int i = 0; i < k; i++) {
            String string = sc.next();
            Integer a = Integer.parseInt(string) - 1;
            Integer b = Integer.parseInt(string) + 1;
            String s1 = String.format("%06d", a);
            String s2 = String.format("%06d", b);
            if (isLucky(s1) || isLucky(s2)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
/* Примечания
Чтобы преобразовать число в массив цифр
его надо преобразовать сначала в строку.

Если в номере есть нули сначала
надо использовать String.format

 */

