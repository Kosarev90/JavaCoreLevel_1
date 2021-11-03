package Lesson_7;

import java.util.Scanner;

public class CatEatFood {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Flesh ", 11),
                new Cat("Kuzia ", 12),
                new Cat("Tima ", 8),
        };

        Plate plate = new Plate(30);

        printInfo(cats, plate); // информация о еде в тарелке
        haveLunch(cats, plate); // коты едят с тарелки

        printInfo(cats, plate);
        addFood(plate); // добавление еды в кансоль

        System.out.println("Added food: ");
        plate.info();
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);

    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter food: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("----Info----");
        plate.info();
        printInfo(cats);
        System.out.println("--------");
        System.out.println();
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Did Cat '%s' eat?  Answer: %s%n", cat.getName(), result);
        }

    }

    private static void printInfo(Cat... cats) {
        for (Cat cat : cats) {
            System.out.println("this Is cat " + cat.getName() + cat.getAppetite() + " hungry? Answer: " +
                    !cat.isFull());
        }
    }

}
