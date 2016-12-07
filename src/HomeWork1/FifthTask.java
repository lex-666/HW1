package HomeWork1;

import java.util.Scanner;

/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в

 переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m –

 вводит пользователь).*/

public class FifthTask {
    public static void task5() {
        double numberN;
        double numberM;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:  ");
        numberN = scan.nextDouble();
        System.out.print("Enter m:  ");
        numberM = scan.nextDouble();
        if (Math.abs(numberN - 10) == Math.abs(numberM - 10)) {
            System.out.println("n и m одинаковы");
        }else {
            if (Math.abs(numberN - 10) < Math.abs(numberM - 10)) {
                System.out.println("n ближе" + "  n = " + numberN);
            }else
                System.out.println("m ближе" + "  m = " + numberM);
        }


    }

}
