package org.example.homeworks.homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static char[][] map;
    private final static int MAP_SIZE = 3;
    private final static char DOT_X = 'X';
    private final static char DOT_O = 'O';
    private final static char DOT_EMPTY = '•';
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        init();
        print();
        while (true) {
            humanTurn();
            print();
            if (checkWinCycle(DOT_X)) {
                System.out.println("ТЫ ВЫЙГРАЛ!");
                break;
            }
            if (checkDraw()) {
                System.out.println("НИЧЬЯ");
                break;
            }
            computerTurn();
            print();
            if (checkWinCycle(DOT_O)) {
                System.out.println("КОМПЬЮТЕР ВЫЙГРАЛ!");
                break;
            }
            if (checkDraw()) {
                System.out.println("НИЧЬЯ");
                break;
            }
        }
    }

    private static boolean checkWin(char dot) {
        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) {
            return true;
        }
        if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) {
            return true;
        }
        if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) {
            return true;
        }
        if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][2] == dot && map[1][1] == dot && map[2][0] == dot) {
            return true;
        }
        return false;
    }

    private static boolean checkWinCycle(char dot) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != dot) {
                    break;
                }
                if (j == map.length - 1 && map[i][map.length - 1] == dot) {
                    return true;
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[j][i] != dot) {
                    break;
                }
                if (j == map.length - 1 && map[j][i] == dot) {
                    return true;
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] != dot) {
                    break;
                }
                if (map[map.length - 1][map.length - 1] == dot) {
                    return true;
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            int j = map.length - 1 - i;
            if (map[i][j] != dot) {
                break;
            }
            if (i == map.length - 1 && map[i][j] == dot) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void computerTurn() {
        System.out.println("Ход компьютера");
        int x, y;
        do {
            x = random.nextInt(MAP_SIZE);
            y = random.nextInt(MAP_SIZE);
        } while (cellIsNotEmpty(x + 1, y + 1, DOT_O));
        map[x][y] = DOT_O;
    }

    private static void humanTurn() {
        int x, y;
        do {
            while (true) {
                System.out.println("Пожалуйста, введите координаты в формате 'х у'");
                if (sc.hasNextInt()) {
                    x = sc.nextInt();
                } else {
                    System.out.println("Ваш ввод координаты Х неверный");
                    sc.nextLine();
                    continue;
                }
                if (sc.hasNextInt()) {
                    y = sc.nextInt();
                    break;
                } else {
                    System.out.println("Ваш ввод координаты Y неверный");
                    sc.nextLine();
                }
            }
        } while (cellIsNotEmpty(x, y, DOT_X));
        map[x - 1][y - 1] = DOT_X;
    }

    private static boolean cellIsNotEmpty(int x, int y, char dot) {
        if (x < 1 || x > MAP_SIZE || y < 1 || y > MAP_SIZE) {
            System.out.println("Выход за границы допустимых значений");
            return true;
        }
        boolean check = map[x - 1][y - 1] == DOT_EMPTY;
        if (check) {
            return false;
        } else {
            if (dot == DOT_X) {
                System.out.println("Ячейка занята");
            }
            return true;
        }
    }

    private static void print() {
        for (int i = 0; i < map.length + 1; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print((i) + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void init() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
