package HomeWork1;

public class App {


    public static void main(String[] args) {

        System.out.println("------------First Task------------");
        FirstTask firstTask = new FirstTask();
        System.out.println("i = " + FirstTask.i);
        System.out.println("a = " + FirstTask.a);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("------------Second Task (Dog)------------");
        Dog Dog1 = new Dog();
        Dog Dog2 = new Dog();
        Dog1.name = "spot";
        Dog1.says = "Ruff";
        Dog2.name = "scruffy";
        Dog2.says = "Wurf";
        System.out.println("First dog name = " + Dog1.name);
        System.out.println("First dog says = " + Dog1.says);
        System.out.println("Second dog name = " + Dog2.name);
        System.out.println("Second dog says = " + Dog2.says);
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("------------Third Task------------");
        ThirdTask number = new ThirdTask();
        number.enterNumber();
        number.checkNumber();
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("------------Fourth Task------------");
        FourthTask fourthTask = new FourthTask();
        fourthTask.enterNumber();
        fourthTask.summa();
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("------------Fifth Task------------");
        FifthTask fifthTask = new FifthTask();
        fifthTask.task5();
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("------------Sixth Task------------");
        SixthTask sixthTask = new SixthTask();
        sixthTask.task6();
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("------------Seventh Task------------");
        SeventhTask seventhTask = new SeventhTask();
        SeventhTask.task7();
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("------------Eighth Task------------");

        System.out.println("-----------------------------------------");
        System.out.println();

    }
}
