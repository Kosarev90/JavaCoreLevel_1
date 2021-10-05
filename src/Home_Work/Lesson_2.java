
package Home_Work;

public class Lesson_2 {
    public static void main(String[] args) {
        IntSum(12, 4);
        IntegerCheck(-2);
        IntegerReturn(33);
        WriteInt("GeekBrains", 5);
        Year();

    }

    public static boolean IntSum(int a, int b) {
        int summa = a + b;
        if (summa >= 10 && summa <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void IntegerCheck(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


    public static boolean IntegerReturn(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void WriteInt(String name, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(name);
        }
    }

    static boolean Year() {
        int a = 400;
        if (a % 4 == 0) {
            if ((a % 100 != 0) || (a % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }
}
