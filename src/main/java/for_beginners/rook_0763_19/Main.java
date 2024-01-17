package for_beginners.rook_0763_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 1 & y == 1 ) System.out.println(0); // никто не выиграл
        else if (x == y) System.out.println(2); // первому придется выходить из диагонали
        else System.out.println(1);
    }
}

/*
Выигрышная стратегия состоит в том, чтобы всегда
возвращать ладью в диагональ. (см рис)
 */
