package org.example.homeworks.homework10.words;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = createList("дом", "машина", "животное", "птица", "рыба", "суп", "работа", "адрес", "цвет", "материал", "материал");
        List<String> setList = createSetList(words);
        System.out.println(words);
        System.out.println(setList);
        searchDuplicates(words, createSetList(words));
    }

    private static List<String> createList(String... strings) {
        return List.of(strings);
    }

    private static List<String> createSetList(List<String> words) {
        List<String> wordsSetList = new ArrayList<>();
        for (String word : words) {
            if (!wordsSetList.contains(word)) {
                wordsSetList.add(word);
            }
        }
        return wordsSetList;
    }


    private static void searchDuplicates(List<String> words, List<String> wordsSetList) {
        for (int i = 0; i < wordsSetList.size(); i++) {
            int count = 0;
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    count += 1;
                }
            }
            System.out.println(words.get(i) + " - количество совпадений: " + count);
        }
    }
}
