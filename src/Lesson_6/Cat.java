package Lesson_6;

class Cat extends Animals {

    public static final int MAX_RUN = 500;
    public static final int MAX_SWIM = 0;
    public static final int MAX_JUMP = 1;

    private static int count;

    public static int getCount() {
        return count;
    }

    public Cat(int maxRunDistance, int maxSwimDistance, int maxJumpDistance) {
        super(maxRunDistance, maxSwimDistance, maxJumpDistance);
        count++;
    }

    public Cat() {
        this(MAX_RUN, MAX_SWIM, MAX_JUMP);
    }


    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance){
            System.out.println("Cat run:" + maxRunDistance+ " If distance:" + distance);
            return true;
        }
        System.out.println("Cat NOT run: "+ maxRunDistance + "if distance" + distance );
        return false;
    }


    @Override
    public boolean swim(int distance) {
        System.out.println("Cat do not swim!");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (this.maxJumpDistance >= height){
            System.out.println("Cat jump:" + maxJumpDistance + " If distance;" + height);
            return true;
        }
        System.out.println("Cat  NOT jump:" + maxJumpDistance + " If distance;" + height);
        return false;
    }
}
