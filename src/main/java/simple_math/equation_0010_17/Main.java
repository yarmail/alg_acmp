package simple_math.equation_0010_17;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = -100; i <= 100 ; i++) {
            if (a* Math.pow(i, 3) + b * Math.pow(i, 2) + c * i + d == 0) {
                set.add(i);
            }
        }
        set.forEach(System.out::println);
    }
}

/* Примечание
Как я понимаю кратность корня - это чтобы ответы не повторялись

 */