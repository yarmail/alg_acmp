package number_systems.one_0022_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Long.toBinaryString(sc.nextInt())
                .replaceAll("0","").length());
    }
}