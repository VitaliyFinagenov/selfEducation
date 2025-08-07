package org.example.homeworks.homework12.replaicingTwoArrayElements;

import java.util.Arrays;

/*
Написать метод, который меняет два элемента массива местами (массив может быть любого
ссылочного типа);
 */
public class Main {

    public static void main(String[] args) {
        String[] strings = {"one", "two", "three"};

        System.out.println(Arrays.toString(replaceTwoArrayElements(strings, 1, 3)));
    }

    private static String[] replaceTwoArrayElements(String[] strings, int firstIndexElementReplace, int secondIndexElementReplace) {
        String[] stringsAfterReplacement = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            if (i == (firstIndexElementReplace - 1)) {
                stringsAfterReplacement[i] = strings[secondIndexElementReplace - 1];
            } else if (i == (secondIndexElementReplace - 1)) {
                stringsAfterReplacement[i] = strings[firstIndexElementReplace - 1];
            } else {
                stringsAfterReplacement[i] = strings[i];
            }
        }
        return stringsAfterReplacement;
    }
}
