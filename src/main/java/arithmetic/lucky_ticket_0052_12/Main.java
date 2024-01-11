package arithmetic.lucky_ticket_0052_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] num = string.chars().map(x -> x - '0').toArray();
        if (num[0] + num[1] + num[2] == num[3] + num[4] + num[5])
            System.out.println("YES");
        else System.out.println("NO");
    }
}