package for_beginners.thaw_0264_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //общее количество дней
        int count = 0;
        int series = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt(); //среднесуточная температура
            if (t > 0) {
                count++;
                if (series < count) {
                    series = count;
                }
            }
            if (t <= 0) {
                if (series < count) {
                    series = count;
                }
                count = 0;
            }
        }
        System.out.println(series);
    }
}

/* Примечание
Сначала не получалось решить задачу,
падал тест 5 (вероятно везде +)
и серия не шла за счетчиком
*/
