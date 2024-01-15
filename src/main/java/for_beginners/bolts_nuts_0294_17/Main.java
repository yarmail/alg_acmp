package for_beginners.bolts_nuts_0294_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt();// болты - кратно 100
        int l1 = sc.nextInt();// процент потерянных деталей
        int m1 = sc.nextInt();// стоимость 1 болта

        int k2 = sc.nextInt();// гайки - кратно 100
        int l2 = sc.nextInt();// процент потерянных деталей
        int m2 = sc.nextInt();// стоимость 1 гайки

        int p1 = k1 / 100 * l1;// количество потерянных болтов
        int p2 = k2 / 100 * l2;// количество потерянных гаек

        int s1 = k1 / 100 * l1 * m1;// стоимость потерянных болтов
        int s2 = k2 / 100 * l2 * m2;// стоимость потерянных гаек

        k1 = k1 - p1; // остаток болтов
        k2 = k2 - p2; // остаток гаек

        int s3 = 0; //вычисляем стоимость непарных элементов
        if (k1 > k2) s3 = (k1 - k2) * m1;
        if (k2 > k1) s3 = (k2 - k1) * m2;

        System.out.println(s1 + s2 + s3);
    }
}