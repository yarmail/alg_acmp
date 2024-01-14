package geometry.ring_0894_16;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble(); // площадь кольца
        double r1 = sc.nextDouble(); // радиус внешней окружности

        // Используем формулу нахождения площади кольца
        double r2 = Math.sqrt((Math.PI * Math.pow(r1, 2) - s) / Math.PI);
        String result = String.format("%.3f", r2);
        System.out.println(result);
    }
}

/* Примечание
Изначально были проблемы с точками после целых чисел,
попробовал исправить с помощью Locale
 */