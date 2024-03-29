package for_beginners.playing_dice_0929_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // количество очков первого игрока
        long max = 6 * n;
        long min = n / 6;
        n %= 6;
        if (n > 0 ) min += 7-n;
        System.out.println(min);
        System.out.println(max);
    }
}

/* Примечания
Таблица напротив: 1-6, 2-5, 3-4

Из условия 10 в 10 степени, поэтому лучше брать long

Рассматриваем из примера 2 - минимум на обороте это 5,
Максимум - это 2 раза по 1, на обратной стороне 6+6 = 12

long max = 6 * n;
Какое бы количество очков не получил 1 человек, мы рабиваем его
на единицы и получаем с обратной стороны шестерки

long min = n / 6;
На первом этапе для поиска минимума предполагаем что внизу как можно больше
шестерок, чтобы сверху были единицы

n %= 6;
Остается какой-то остаток от деления на 6 на предыдущем шаге
чтобы получить 2 число наверху мы должны это число вычесть из 7
(чтобы из 1 получить 6 надо вычесть 1 из 7)

 */