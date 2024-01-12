package for_beginners.subarray_array_0284_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество элементов в массиве a
        List<Integer> a = new ArrayList<>(); //исходный массив
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int m = scanner.nextInt(); // количество подмассивов, которые необходимо вывести
        for (int i = 0; i < m; i++) {
            int index1 = a.indexOf(scanner.nextInt()); // индексы искомых элементов
            int index2 = a.indexOf(scanner.nextInt());
            for (int j = index1; j <=index2 ; j++) {
                System.out.println(a.get(j));
            }
        }
    }
}
/*
У меня тестовый пример проходит, а на сайте я получаю ошибку
Runtime error	4 тест
Возможно это связано с тем, что числа очень большие
Возможно надо делать со строками

 */