package Lesson_6;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Animals[] retest = test();
        playTest(retest);

    }

    private static Animals[] test() {
        return new Animals[]{
                new Cat(),
                new Dog(),
                new Cat(250, 0, 1),
                new Dog(1000, 100, 2),
                new Dog(2000, 300, 1)};
    }

    private static void playTest (Animals[] retest){
        Random random = new Random();

        for (Animals t : retest ) {
            t.printInfo();
            System.out.println(t.run(random.nextInt(1000)));
            System.out.println(t.jump(random.nextInt(3)));
            System.out.println(t.swim(random.nextInt(300)));
        }

        System.out.println(Animals.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}

