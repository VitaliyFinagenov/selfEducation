package org.example.homeworks.homework1;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumNumbers(1, 10));
        System.out.println();
        positiveOrNegativeNumber(5);
        System.out.println();
        System.out.println(positiveNumberOrNot(-2));
        System.out.println();
        printLine("Hallow", 5);
        System.out.println();
        System.out.println(leapYear1(2000));
        System.out.println(leapYear(2000));
    }

    public static boolean sumNumbers(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean positiveNumberOrNot(int a) {
        return a >= 0;
    }

    public static void printLine(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0){
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static boolean leapYear1(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ;
    }
}