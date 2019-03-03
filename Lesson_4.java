
import java.util.Random;
import java.util.Scanner;

//
public class Lesson_4 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    // Метод проверки выигрыша, 4 в ряд, в поле 5 на 5, сделал вроде бы циклами, так что здесь получается 2 и третье задание(которое со звёздочкой)
    public static boolean checkWin(char symb) {
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                boolean cols, rows;
                for (int col = x; col < DOTS_TO_WIN + x; col++) {
                    cols = true;
                    rows = true;
                    for (int row = y; row < DOTS_TO_WIN + y; row++) {
                        cols &= (map[col][row] == symb);
                        rows &= (map[row][col] == symb);
                    }

                    if (cols || rows) return true;
                }

                boolean toright, toleft;
                toright = true;
                toleft = true;
                for (int i = x; i < DOTS_TO_WIN + x; i++) {
                    toright &= (map[i][i] == symb);
                    toleft &= (map[DOTS_TO_WIN + x - i - 1][i] == symb);
                }

                if (toright || toleft) return true;
            }
        }


        return false;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
// Это метод для  ИИ, в котором он не дает сделать победный ход человеку.
    public static void aiTurn() {
        int a= -1;
        int b = -1;
        boolean user_win = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[j][i] = DOT_X;
                    if (checkWin(DOT_X)) {
                        a = i;
                        b = j;
                        user_win = true;
                    }
                        map[j][i] = DOT_EMPTY;

                }
            }
        }
        if (!user_win) {
            do {
                a = rand.nextInt(SIZE);
                b = rand.nextInt(SIZE);
            } while (!isCellValid(a, b));

        }
        map[b][a] = DOT_O;
        System.out.println("Компьютер походил в точку " + (a + 1) + " " + (b + 1));



    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.print("Введите координату X: ");
            x = sc.nextInt() - 1;
            System.out.println();
            System.out.print("Введите координату Y: ");
            y = sc.nextInt() - 1;
            System.out.println();
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
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


