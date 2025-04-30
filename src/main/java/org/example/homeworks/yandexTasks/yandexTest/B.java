package org.example.homeworks.yandexTasks.yandexTest;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String[] strArr = str.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.valueOf(strArr[i]);
        }

        if (intArr[0] == intArr[intArr.length - 1]) {
            System.out.println(number);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}