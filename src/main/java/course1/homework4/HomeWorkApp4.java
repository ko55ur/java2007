package course1.homework4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    public static final int SIZE = 3;
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '*';
    public static final Scanner SCANNER;
    public static final Random RANDOM;
    public static char[][] gameArea;

    public HomeWorkApp4() {
    }

    public static void initGameArea() {
        gameArea = new char[SIZE][SIZE];

        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea.length; j++) {
                gameArea[i][j] = '*';
            }
        }

    }

    public static void printGameArea() {
        for(int i = 0; i <= gameArea.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 0; i < gameArea.length; i++) {
            System.out.print(i + 1 + "|");

            for(int k = 0; k < gameArea.length; k++) {
                System.out.print(gameArea[i][k] + " ");
            }

            System.out.println();
        }

    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while(!isCellValid(x, y));

        gameArea[y][x] = 'X';
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(3);
            y = RANDOM.nextInt(3);
        } while(!isCellValid(x, y));

        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        gameArea[y][x] = '0';
    }

    public static boolean isCellValid(int x, int y) {
        if (x >= 0 && x < 3 && y >= 0 && y < 3) {
            return gameArea[y][x] == '*';
        } else {
            return false;
        }
    }

    public static boolean checkWin(char symbol) {
        char sum = 0;
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea.length; j++) {
                if ((gameArea[i][j] == symbol && gameArea[i][j] == symbol && gameArea[i][j] == symbol) || (gameArea[j][i] == symbol && gameArea[j][i] == symbol && gameArea[j][i] == symbol))
                    return true;
                if ((gameArea[0][0] == symbol && gameArea[1][1] == symbol && gameArea[2][2] == symbol) || (gameArea[2][0] == symbol && gameArea[1][1] == symbol && gameArea[0][2] == symbol))
                    return true;
            }
        }
            /*for (int k = gameArea.length - (gameArea.length - 1); k < gameArea.length; k++) {
                for (int j = 0; j < gameArea[i].length; j++)
                    for (int l = gameArea.length - (gameArea.length - 1); l < gameArea[i].length; l++) {
                   // sum += gameArea[symbol];
                            return true;
                        }
          }
                   }
        */
        return false;
    }


    /*if (gameArea[0][0] == symbol && gameArea[0][1] == symbol && gameArea[0][2] == symbol) {
        return true;
    } else if (gameArea[1][0] == symbol && gameArea[1][1] == symbol && gameArea[1][2] == symbol) {
        return true;
    } else if (gameArea[2][0] == symbol && gameArea[2][1] == symbol && gameArea[2][2] == symbol) {
        return true;
    } else if (gameArea[0][0] == symbol && gameArea[1][0] == symbol && gameArea[2][0] == symbol) {
        return true;
    } else if (gameArea[0][1] == symbol && gameArea[1][1] == symbol && gameArea[2][1] == symbol) {
        return true;
    } else if (gameArea[0][2] == symbol && gameArea[1][2] == symbol && gameArea[2][2] == symbol) {
        return true;
    } else if (gameArea[0][0] == symbol && gameArea[1][1] == symbol && gameArea[2][2] == symbol) {
        return true;
    } else {
        return gameArea[0][2] == symbol && gameArea[1][1] == symbol && gameArea[2][0] == symbol;
    }
}
*/
    public static boolean isGameAreaFull() {
        for (int i = 0; i < gameArea.length; ++i) {
            for (int j = 0; j < gameArea[i].length; ++j) {
                if (gameArea[i][j] == '*') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        initGameArea();
        printGameArea();

        while(true) {
            humanTurn();
            printGameArea();
            if (checkWin('X')) {
                System.out.println("Побеждает человек");
                break;
            }

            if (isGameAreaFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printGameArea();
            if (checkWin('0')) {
                System.out.println("Победил робот");
                break;
            }

            if (isGameAreaFull()) {
                System.out.println("Ничья!");
            }
        }

        System.out.println("Игра окончена");
    }

    static {
        SCANNER = new Scanner(System.in);
        RANDOM = new Random();
    }
}
