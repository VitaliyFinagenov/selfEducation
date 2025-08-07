package org.example.homeworks.homework12.convertingAnArrayToList;

/*
Написать метод, который преобразует массив в ArrayList;
*/

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};

        System.out.println(transformationToList(intArr));
    }

    private static List<Object> transformationToList(Object[] intArr) {
        return Arrays.asList(intArr);
    }
}
