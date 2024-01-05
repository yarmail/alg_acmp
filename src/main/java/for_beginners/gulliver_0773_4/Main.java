package for_beginners.gulliver_0773_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short k = scanner.nextShort(); // во сколько раз больше
        short m = scanner.nextShort(); // количество слоев
        System.out.println(k*k*m);
    }
}