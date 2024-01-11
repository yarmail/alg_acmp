package math_model.stairs_0514_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); //количество кубиков
        int s = 1; // сколько кубиков нужно на следущую ступеньку
        while (s <= k) {
            k -= s;
            s++;
        }
        System.out.println(s-1);
    }
}
/* Примечания
s <= k
пока количество кубиков, которое нам нужно чтобы поставить следующую
ступеньку меньше или равно тому количеству кубиков, что у нас осталось

k -= s
мы вычитаем эту ступеньку

s++
на следующем шаге ступенька будет на кубик больше

s-1
количество ступенек
 */