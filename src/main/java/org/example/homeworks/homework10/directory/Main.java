package org.example.homeworks.homework10.directory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> directory = new HashMap<>();

        directory.put("999 99 99", "Иванов");
        directory.put("888 88 88", "Сидоров");
        directory.put("777 77 77", "Петров");
        directory.put("666 66 66", "Боков");
        directory.put("555 55 55", "Маркушов");
        directory.put("444 44 44", "Иванов");

        getBySurname("Иванов", directory);
    }

    private static void getBySurname(String surname, Map<String, String> directory) {
        System.out.println("По фамилии " + surname + ":");
        for (Map.Entry<String, String> element : directory.entrySet()) {
            if (element.getValue().equals(surname)) {
                System.out.println(String.format("\tтел. = %s;", element.getKey()));
            }
        }
    }
}
