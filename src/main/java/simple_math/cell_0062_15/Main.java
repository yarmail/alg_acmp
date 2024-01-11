package simple_math.cell_0062_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.next().split("");
        char ch = string[0].charAt(0);
        int x = ch - 'A' + 1; // получаем из первого символа число по горизонту
        int y = Integer.parseInt(string[1]); // получаем вертикаль
        if ((x + y) % 2 == 0) System.out.println("BLACK");
        else System.out.println("WHITE");
    }
}

/* Примечания
По условию задачи Вертикаль снизу-вверх 1-8
Горизонталь A-H слева-направо
A1 - черная клетка.

Удобнее работать с цифрами чем с буквами, поэтому
буквы будем переделывать в цифры по следующему правилу
1 = A - A + 1; 2 = B - A + 1; 3 = C - A + 1 и т.д.

Далее замечаем что сумма координат белых клеток
нечетное число, а сумма координат черных клеток - четное

 */