package for_beginners.zero_0043_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next() + 1;
        char[] arr = string.toCharArray();
        int count = 0;
        int series = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') count++;
            if (arr[i] == '1') {
                series = Math.max(count, series);
                count = 0;
            }
        }
        System.out.println(series);
    }
}
/*
В примере: 00101110000
Как я понимаю, если не добавлять в конец единицу
001011100001
последние нули может отбросить и результат может быть неверным
 */