package for_beginners.neighboring_cells_0791_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //заданное число
        if (n > 8 ) System.out.println(n - 8); // клетка снизу есть
        if ((n - 1) % 8 != 0) System.out.println(n - 1); // клетка слева есть
        if (n % 8 != 0) System.out.println(n + 1); // клетка справа есть
        if (n < 57) System.out.println(n + 8); //клетка сверху есть
    }
}
/* Примечания
(вывести в порядке возрастания)

- 1 - клетка что слева
+ 1 - клетка справа

- 8 - клетка снизу
Если n > 8, то клетка снизу есть

+ 8 - клетка сверху

 */

