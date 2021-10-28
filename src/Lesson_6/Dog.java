package Lesson_6;

 class Dog extends Animals {

    public static final int MAX_RUN = 4000;
    public static final int MAX_SWIM = 100;
    public static final int MAX_JUMP = 2;

    private static int count;

    public static int getCount(){
        return  count;
    }

    public Dog(int maxRunDistance, int maxSwimDistance, int maxJumpDistance) {
        super(maxRunDistance, maxSwimDistance, maxJumpDistance);
        count++;
    }

    public Dog() {
        this(MAX_RUN, MAX_SWIM, MAX_JUMP);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.println("Dog run: " + maxRunDistance + " If distance: " + distance);
            return true;
        }
        System.out.println("Dog NOT run: "+ maxRunDistance + "if distance" + distance );
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (this.maxswimdistance >= distance) {
            System.out.println("Dog swim: " + maxswimdistance + " If distance: " + distance);
            return true;
        }
            System.out.println("Dog NOT swim: "+ maxRunDistance + "if distance" + distance );
        return false;
    }

     @Override
    public boolean jump(int height) {
        if (this.maxJumpDistance >= height) {
            System.out.println("Dog jump: " + maxJumpDistance + " If distance: " + height);
            return true;
        }
         System.out.println("Dog NOT jump: "+ maxJumpDistance + "if distance" + height );
        return false;
    }
}
