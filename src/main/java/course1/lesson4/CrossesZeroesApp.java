package course1.lesson4;

import java.util.Scanner;

public class CrossesZeroesApp {

    //поле
    public static char[][] map;

    //размер поля
    public static final int SIZE = 3;

    //точек для победы
    public static final int DOTS_TO_WIN = 3;

    //Описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Проинициализировать поле.
     */

    public static void initMap() {
        map = new char[SIZE][SIZE];
        //for (int j = 0; j < map[i].length; j++) {
        //  map[i][j] = DOT_EMPTY;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

        //Arrays.fill(map[i], DOT_EMPTY);
    }

    /**
     * Вывод игрового поля на экран.
     */
    public static void printMap() {

        //нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {

            System.out.print(i + " ");
        }
        System.out.println();
        //пишем строки мапы
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;

        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;

    }
    /**
     * Проверка валидны ли значения поля
     * @param x координата x
     * @param y координата y
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        initMap();
        printMap();
        humanTurn();
        printMap();
        humanTurn();
        printMap();


    }
}
