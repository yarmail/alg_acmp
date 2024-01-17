package graph_theory.road_0015_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //размер матрицы
        int count = 0; // счетчик единиц
        for (int i = 0; i < n * n; i++) {
            if (sc.nextInt() == 1) count++;
        }
        System.out.println(count/2);
    }
}
/*
Каждая дорога отображается двумя единицами
Из примера это (примерно) например
Б1 - А2, А3 - А4, и Б3 - Б4
Один из способов решений - посчитать все единицы и разделить на 2
 */