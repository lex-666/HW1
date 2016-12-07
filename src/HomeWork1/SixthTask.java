package HomeWork1;

import java.util.Scanner;

/*В переменных a и b лежат положительные длины катетов прямоугольного треугольника.

Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит

пользователь).
 */

public class SixthTask {
    public static void task6() {
        double catetA;
        double catetB;
        double square;
        double perimetr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:  ");
        catetA = scan.nextDouble();
        System.out.print("Enter b:  ");
        catetB = scan.nextDouble();
        square = (catetA * catetB) / 2;
        perimetr = catetA + catetB + Math.sqrt(Math.pow(catetA, 2) + Math.pow(catetB, 2));
        System.out.println("Square = " + square);
        System.out.println("Perimetr = " + perimetr);
        }
}
