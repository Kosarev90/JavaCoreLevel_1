package Home_Work;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWorlds();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWorlds(){
        System.out.println ("Orange \n Banana \n Apple");
    }

    public static void chekSumSign(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 77;
        if (value <= 0){
            System.out.println("красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("желтый");
        }
        if (value > 100){
            System.out.println("зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 20;
        int b = 43;
        if(a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}



