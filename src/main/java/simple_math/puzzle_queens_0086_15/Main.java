package simple_math.puzzle_queens_0086_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // размеры шахматной доски
        System.out.println((n - 2) * (n - 1));
    }
}
/* Примечание
(см рис. 01) Сдвигаем вниз диагональ и замеряем
количество пустых полей, относительно полей,
куда нельзя ставить ферзей, получается (n-2) * (n-1)
 */