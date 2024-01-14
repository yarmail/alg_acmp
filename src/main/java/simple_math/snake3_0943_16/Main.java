package simple_math.snake3_0943_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество строк матрицы
        int m = sc.nextInt(); // количество столбцов матрицы
        int y = sc.nextInt(); // номер строки
        int x = sc.nextInt(); // номер столбца

        int r = (y - 1) * m; //количество элементов в предыдущих строках
        if (y % 2 == 0) r += m - x; // в случае четной строки
        else r += x - 1;
        System.out.println(r);
    }
}