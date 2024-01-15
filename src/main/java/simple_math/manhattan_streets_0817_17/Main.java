package simple_math.manhattan_streets_0817_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // авеню
        long m = sc.nextLong(); // улицы
        long d = sc.nextLong(); // ширина
        long k = sc.nextLong(); // длина

        System.out.println((n + m) * k * d - n * m * d * d);
    }
}
/* Примечания
- суммарная площадь всех улиц (n + m) * k * d
- площадь перекрестков - n * m - количество перекрестков
* d * d - ширина перекрестков



 */
