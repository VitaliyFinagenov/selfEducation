package org.example.homeworks.homework10.words;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(createList("дом", "машина", "животное", "птица", "рыба", "суп", "работа", "адрес", "цвет", "материал", "материал"));
        ArrayList<String> words = new ArrayList<>(List.of("дом", "машина", "животное", "птица", "рыба", "суп", "работа", "адрес", "цвет", "материал", "материал"));
        createSetList(createList()); //почему так возвращает пустые скобки?
        System.out.println(createSetList(words));
        searchDuplicates(words, createSetList(words));
    }

    private static ArrayList<String> createList(String... strings) {
        ArrayList<String> wordsList = new ArrayList<>(List.of(strings));
        return wordsList;
    }

    private static ArrayList<String> createSetList(ArrayList<String> words) {
        ArrayList<String> wordsSetList = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (!wordsSetList.contains(words.get(i))) {
                wordsSetList.add(words.get(i));
            }
        }
        return wordsSetList;
    }

    private static void searchDuplicates(ArrayList<String> words, ArrayList<String> wordsSetList) {
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
