package for_beginners.keyboard_0066_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        String all = "qwertyuiopasdfghjklzxcvbnmq";
        char[] arr = all.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch && i + 1 < arr.length) System.out.println(arr[i+1]);
        }
    }
}
/* Примечание
Добавляем q в конец для замкнутости

 */