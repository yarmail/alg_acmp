package for_beginners.alcohol_0757_10;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger c = scanner.nextBigInteger(); // образец с = 2
        BigInteger h = scanner.nextBigInteger(); // образец h = 6
        BigInteger o = scanner.nextBigInteger(); // образец o = 1
        BigInteger count = BigInteger.valueOf(0);
        if (c.compareTo(BigInteger.valueOf(2)) >= 0
                && h.compareTo(BigInteger.valueOf(6)) >= 0
                && o.compareTo(BigInteger.valueOf(1)) >= 0) {
            c = c.divide(BigInteger.valueOf(2));
            h = h.divide(BigInteger.valueOf(6));
            count = c;
            if (h.compareTo(count) < 0) count = h;
            if (o.compareTo(count) < 0) count = o;
        }
        System.out.println(count);
    }
}

/* Примечание
Числа очень большие, поэтому пришлось перейти на BigInteger,
иначе было Runtime error
 */