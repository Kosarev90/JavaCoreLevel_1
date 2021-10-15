package Home_Work;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        arrayChange();
        arrayHundred();
        arrayMultiplicationInTwo();
        arraySquare();
        arrayArg(2, 3);
        // arrayMaxMin();


    }

    public static void arrayChange() {
        int[] Integer = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        int MaxInt = Integer.length;
        for (int i = 0; i < MaxInt; i++) {
            System.out.print(i + "-" + Integer[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < MaxInt; i++)
            if (Integer[i] == 1) {
                Integer[i] = 0;
            } else Integer[i] = 1;
        for (int i = 0; i < MaxInt; i++) {
            System.out.print(i + "-" + Integer[i] + " ");
        }
    }

    public static void arrayHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println("[" + i + "] => " + array[i]);
        }
    }

    public static void arrayMultiplicationInTwo() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void arraySquare() {
        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    array[i][j] = 1;
                    array[array.length - 1 - i][j] = 1;
                }
            }
        }
    }

    public static int[] arrayArg(int lin, int initialValue) {
        int[] array = new int[lin];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void arrayMaxMin() {
        int[] array = {3, 23, 33, 21, 1, 32, 54, 25, 5};
        Arrays.sort(array);
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            System.out.println("Максимальное число массива - " + max);
            for (int j : array) {
                if (j < min) {
                    min = j;
                }
            }
            System.out.println("Минимальное число массива - " + min);
        }
    }
}


