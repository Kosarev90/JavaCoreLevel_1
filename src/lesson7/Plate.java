package lesson7;

public class Plate {

    private int food;

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    // Состояние тарелки
    public void info() {
        System.out.println("plate: " + food);
    }

    // Уменьшение еды в тарелке
    public void decreaseFood(int appetite) { // cat eat food
        this.food = food - appetite;
    }

    // Увеличение еды в тарелке
    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    // проверка досаточности еды в тарелке
    public boolean isFoodEnough(int foodCount) {
        return getFood() >= foodCount;
    }
}

