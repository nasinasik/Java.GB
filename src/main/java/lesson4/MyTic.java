package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class MyTic {

    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static char DOT_HUMAN = 'O';
    public static char DOT_COMP = 'X';
    public static char DOT_EMPTY = '•';

    public static final String EMPTY = " ";
    public static final String FIRST_DOT_EMPTY = "  ";

    public static char[][] map = new char[SIZE][SIZE];
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random randon = new Random();

    public static void main(String[] args) {

        turnOnGame();
    }


    public static void turnOnGame() {

        initMap();
        printMap();
        playGame();

    }

    public static void initMap() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }
        }
    }

    private static void printMap() {

        printMapHeader();
        printMapRows();
    }

    private static void printMapHeader() {
        System.out.print(FIRST_DOT_EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printNumber(i);
        }
        System.out.println();

    }

    private static void printNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void playGame() {

        while (true) {

            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN, "You win!")) {
                System.exit(0);
            }

            compTurn();
            printMap();
            if (checkEnd(DOT_COMP, "Game over")) {
                System.exit(0);
            }
        }

    }

    private static void humanTurn() {

        int rowNum, columnNum;

        do {

            System.out.println("Your turn! Pick up row and column number:");
            scanner.reset();
            System.out.println("Row: ");
            rowNum = scanner.nextInt();
            System.out.println("Column: ");
            columnNum = scanner.nextInt();

        } while (!isCellValid(rowNum, columnNum, DOT_HUMAN));

        map[rowNum - 1][columnNum - 1] = DOT_HUMAN;
    }

    private static boolean isCellValid(int rowNum, int columnNum, char symbol) {
        boolean isHuman = symbol == DOT_HUMAN;

        if (isHuman && ((rowNum < 1) || (rowNum > SIZE) || (columnNum < 1) || (columnNum > SIZE))) {
            System.out.println("\nCheck your row and column number.");
            return false;
        }
        if (map[rowNum - 1][columnNum - 1] != DOT_EMPTY) {
            if (isHuman) {
                System.out.println("\nThe cell is taken.");
            }
            return false;
        }
        return true;

    }

    private static boolean checkEnd(char symbol, String winMessage) {

        if (chekWin(symbol)) {
            System.out.println(winMessage);
            return true;
        }
        if (isMapFull()) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }

    public static boolean chekWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if ((checkRowCol(map[i][0], map[i][1], map[i][2], symbol))
                    || (checkRowCol(map[0][i], map[1][i], map[2][i], symbol))) {
                return true;
            }
        }
        return checkRowCol(map[0][0], map[1][1], map[2][2], symbol)
                || (checkRowCol(map[0][2], map[1][1], map[2][0], symbol));

    }

    private static boolean checkRowCol(char c1, char c2, char c3, char symbol) {

        return ((c1 == symbol) && (c1 == c2) && (c2 == c3));
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char ch : chars) {
                if (ch == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;

    }

    private static void compTurn() {
        int rowNum, columnNum;

        do {
            rowNum = randon.nextInt(SIZE) + 1;
            columnNum = randon.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNum, columnNum, DOT_COMP));

        map[rowNum - 1][columnNum - 1] = DOT_COMP;
    }


}


