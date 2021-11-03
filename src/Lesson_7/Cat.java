package Lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean full;

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

// Состояние еды в тарелке
    public boolean eat(Plate plate) {
        String validateMessage = checkEat(plate);
        if (validateMessage !=  null){
            System.out.println(validateMessage);
            return false;
        }
        doEat(plate); // кот поел
        full = true;
        return true;
    }


    // Сосотояние еды в тарелке
    private String checkEat(Plate plate){
        if (!plate.isFoodEnough(appetite)){
            return "Food is not enough is the plate!";
        }
        if (full){
            return "Cat is already full!";
        }
        return null;
    }

    // кот есть из тарелки
    private void doEat(Plate plate){
        plate.decreaseFood(appetite);
    }
    public boolean isFull(){
        return full;
    }

    }
