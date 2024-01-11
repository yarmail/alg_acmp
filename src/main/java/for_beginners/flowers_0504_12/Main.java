package for_beginners.flowers_0504_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество дней
        if (n % 3 == 0 ) System.out.println("GCV");
        if (n % 3 == 1 ) System.out.println("VGC");
        if (n % 3 == 2 ) System.out.println("CVG");
    }
}

/* Примечание
Другой подход основывается на поиске закономерности.
Если выписать первые расстановки цветков для нескольких дней,
то мы получим последовательность «VGC», «CVG», «GCV», «VGC», «CVG»,
«GCV», «VGC», «CVG» … Откуда видно, что период данной последовательности
равен трем и ответ можно формировать по значению K mod 3

 */
