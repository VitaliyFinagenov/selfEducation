package org.example.homeworks.homework10.directory;

public class MainTwo {
    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.add("999 99 99", "Иванов");
        directory.add("888 88 88", "Сидоров");
        directory.add("777 77 77", "Петров");
        directory.add("666 66 66", "Боков");
        directory.add("555 55 55", "Маркушов");
        directory.add("444 44 44", "Иванов");

        System.out.println(directory.getTelephonesBySurname("Иванов"));
    }
}
