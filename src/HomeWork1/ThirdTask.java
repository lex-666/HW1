package HomeWork1;

import java.util.Scanner;

/*Создать программу, проверяющую и сообщающую на экран, является ли целое число,

записанное в переменную n, чётным либо нечётным (n – вводит пользователь).*/

public class ThirdTask {

        int numberThirdTask;

        public void enterNumber() {
            System.out.println("Введите число типа int:");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()){
                this.numberThirdTask =in.nextInt();
            } else {
                in.next();
            }
        }

        public void checkNumber(){

            while (true) {

                if ((numberThirdTask%2)==0){
                    System.out.println("Число - " + numberThirdTask + " четное");
                    break;
                } else {
                    System.out.println("Число - " + numberThirdTask + " нечетное");
                    break;
                }
            }
        }
    }



