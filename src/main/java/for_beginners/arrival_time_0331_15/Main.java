package for_beginners.arrival_time_0331_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] startTime = scanner.next().split(":");
        int hh = Integer.parseInt(startTime[0]); // часы отправления
        int mm = Integer.parseInt(startTime[1]); // минуты отправления

        int addHH = scanner.nextInt(); // часы в пути
        int addMM = scanner.nextInt(); // минуты в пути

        hh += addHH; // общее количество часов
        mm += addMM; // общее количество минут

        hh += mm/60; //добавляем излишек минут
        mm %= 60; // остается остаток минут

        hh %= 24; //делаем кратным 24 часам

        if(hh < 10) System.out.print(0); // пошёл вывод (c нулями впереди)
        System.out.print(hh);
        System.out.print(":");
        if(mm < 10) System.out.print(0);
        System.out.print(mm);
    }
}