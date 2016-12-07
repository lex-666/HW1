package HomeWork1;

import java.util.Scanner;

/*В три переменные a, b и c записаны три вещественных числа. Создать программу, которая

будет находить и выводить на экран вещественные корни квадратного уравнения

ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).*/

public class SeventhTask {
    public static void task7() {
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
