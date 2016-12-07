package HomeWork1;

import java.util.Scanner;

/*В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую

и выводящую на экран сумму цифр числа n (n – вводит пользователь).*/

public class FourthTask {

        int numberFourTask;

        public void enterNumber(){

            System.out.println("Введите натуральное двузначное число");
            Scanner in = new Scanner(System.in);

            while (true){
                if(in.hasNextInt()){
                    numberFourTask = in.nextInt();
                    if (numberFourTask < 0 ){
                        System.out.println("Неверное число");
                        numberFourTask = 0;
                    }else if(numberFourTask > 100 || numberFourTask < 10){
                        System.out.println("Неверное число");
                        numberFourTask = 0;
                    }
                    if (numberFourTask != 0)
                        break;
                } else {
                    System.out.println("Неверное число");
                    in.next();
                }
            }
        }
        public void summa(){
            int summa=0;
            while (numberFourTask != 0) {
                summa += (numberFourTask % 10);
                numberFourTask /= 10;
            }
            System.out.println("Сумма = " + summa);
        }

    }


