package geometry.two_ring_0026_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        if ((r1 <= d + r2) && (r2 <= d + r1) && (r1 + r2 >= d))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
/* Примечания
Надо рассмотреть 2 варианта
- одна окружность находится внутри другой окружности
- окружности пересекаются
*/