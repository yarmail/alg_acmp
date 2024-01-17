package simple_math.riddle_0063_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // сумма
        int p = sc.nextInt(); // произведение
        int x, y;
        for (x = 0; x < s; x++) {
            y = s -x;
            if (x * y == p) {
                System.out.println(x);
                System.out.println(y);
                break;
            }
        }
    }
}

/* Примечания
x 1 -> n]
y s-1 - > n

x = [1 - S-1]

 */