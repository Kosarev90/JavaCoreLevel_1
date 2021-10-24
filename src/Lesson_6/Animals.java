package Lesson_6;

public abstract class Animals {

    private static int count;

    public static int getCount(){
        return count;
    }

    protected int maxRunDistance;
    protected int maxswimdistance;
    protected int maxJumpDistance;

    public Animals(int maxRunDistance, int maxSwimDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxswimdistance = maxSwimDistance;
        this.maxJumpDistance = maxJumpDistance;
        count++;
    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);
    public abstract boolean jump(int height);


    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "maxRunDistance=" + maxRunDistance +
                ", maxSwimDistance=" + maxswimdistance +
                ", maxJumpDistance=" + maxJumpDistance +
                '}';
    }
}