package for_beginners.office_0778_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 31; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum/27);
    }
}