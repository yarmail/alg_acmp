package parsing_strings.number_buses_0691_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество номеров
        String dic1 = "0123456789";
        String dic2 = "ABCEHKMOPTXY";
        for (int i = 0; i < n; i++) {
            char[] arr = sc.next().toCharArray();
            if (arr.length != 6) {
                System.out.println("No");
                continue;
            }
            if (dic2.indexOf(arr[0]) == -1
             || dic2.indexOf(arr[4]) == -1
             || dic2.indexOf(arr[5]) == -1) {
                System.out.println("No");
                continue;
            }
            if (dic1.indexOf(arr[1]) == -1
             || dic1.indexOf(arr[2]) == -1
             || dic1.indexOf(arr[3]) == -1) {
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
        }
    }
}