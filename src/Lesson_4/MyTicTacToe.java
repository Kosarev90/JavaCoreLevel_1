package Lesson_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyTicTacToe {

    public static final int SIZE = 3;
    public static final int DOTS_WIN = 3;

    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final char DOT_EMPTY = '•';
    public static char[][] map = new char[SIZE][SIZE];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initMap();// иницилизация точки
        printMap();// вывод в консоль игрового поля 3 на 3
        while (true) {
            humanTurn(); // ход человека
            printMap();
            if (isMapFull()) {// поле заполнено
                System.out.println("Ничья!");
                break;
            }
            if (isWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }

            aiTurn();// ход компьтера

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            if (isWin(DOT_0)) {
                System.out.println("Победил компьютер!");
                break;
            }
            printMap();
        }
    }

    private static boolean isWin(char symbol) { // проверка победы

        return winColandRow(symbol) || isWinDiagonal(symbol);
    }

    private static boolean isWinDiagonal(char symbol){ // проверка по диагонали
        int mainDiag = 0;
        int sideDiag = 0;
        for (int i = 0; i < SIZE; i++) {
            mainDiag = (map[i][i] == symbol) ? mainDiag +1 : 0;
            sideDiag = (map[i][map.length - 1 -i]) == symbol ? sideDiag +1 :0;
            if (mainDiag == DOTS_WIN || sideDiag == DOTS_WIN){
                return true;
            }
        }
        return false;
    }

    private static boolean winColandRow(int symbol) { // проверка по стобцам и колонкам
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rowCounter = (map[i][j] == symbol) ? rowCounter + 1 : 0;
                colCounter = (map[j][i] == symbol) ? colCounter + 1 : 0;
                if (rowCounter == DOTS_WIN || colCounter == DOTS_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isMapFull() { // проверка поля если ячейки все заняты
        for (int row = 0; row < SIZE; row++) {
            for (int cel = 0; cel < SIZE; cel++) {
                if (isEmptySell(row, cel)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() { // ход компьютера
        int col, row;
        Random random = new Random();
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (!isEmptySell(row, col));
        map[row][col] = DOT_0;
    }

    private static void humanTurn() {
        System.out.println("Введите координаты row col:");
        int row;
        int col;
        do {
            row = readIndex().nextInt();
            col = readIndex().nextInt();

            if (!CheckRange(row) || !CheckRange(col)) {
                System.out.println("Коордитнаты должны быть в диапозони от 0 да " + SIZE);
                continue;
            }
            if (isEmptySell(row - 1, col - 1)) {
                break;
            } else {
                System.out.println("Клетка уже занята");
            }
        } while (true);

        map[row - 1][col - 1] = DOT_X;
    }

    public static boolean isEmptySell(int row, int col) {
        return map[row][col] == DOT_EMPTY;
    }

    private static Scanner readIndex() { // проверка на целое число
        while (!scanner.hasNextInt()) {
            System.out.println("Координаты должны иметь целочисленное значение!");
            scanner.nextInt();
        }
        return scanner;
    }


    private static boolean CheckRange(int index) {// проверка на размер
        return index >= 1 && index <= SIZE;
    }


    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }


    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
