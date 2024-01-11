package for_beginners.programmer_day_0550_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0))
            System.out.print("12/09/");
        else System.out.print("13/09/");
        if (n < 10) System.out.print("0");
        if (n < 100) System.out.print("0");
        if (n < 1000) System.out.print("0");
        System.out.print(n);
    }
}