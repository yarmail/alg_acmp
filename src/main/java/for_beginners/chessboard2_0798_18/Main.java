package for_beginners.chessboard2_0798_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int c = sc.nextInt();

        if (n * m % 2 == 0) System.out.println("equal");
        else if ((i + j) % 2 == c) System.out.println("black");
        else System.out.println("white");
    }
}

/* Примечания
Если i + j четная - то, она того же цвета что и 1 1
Если i + j нечетная - то, она другого цвета что и 1 1

"Несложно понять, что больше получится клеток того цвета,
которые расположены в углах доски. В частности, нас может интересовать клетка
с координатами (1,1), ее цвет и следует вывести в качестве ответа."

Решение пока не очень понятно
 */
