package for_beginners.circle_0297_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        long sum = 0;
        for(char ch: arr) {
            switch (ch) {
                case ('6'), ('9'), ('0') -> sum++;
                case ('8') -> sum += 2;
            }
        }
        System.out.println(sum);
    }
}

/* Примечание
Круляши - это круглые элементы цифр
 */