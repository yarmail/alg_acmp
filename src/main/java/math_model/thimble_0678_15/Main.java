package math_model.thimble_0678_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] chars = scanner.next().toCharArray();
        int n = 1; // шарик находится в позиции 1
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                if (n == 1) n = 2;
                else if (n == 2) n = 1;
            }
            if (chars[i] == 'B') {
                if (n == 2) n = 3;
                else if (n == 3) n = 2;
            }
            if (chars[i] == 'C') {
                if (n == 1) n = 3;
                else if (n == 3) n = 1;
            }
        }
        System.out.println(n);
    }
}

/* Примечание
Мы должны учесть, что у n может быть 2 позиции

 */
