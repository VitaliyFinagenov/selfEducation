package org.example.homeworks.homework9;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"q", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};

        try {
            checkSize(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkSize(String[][] strings) {
        if (strings.length < 5) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length > 4) {
                    throw new MyArraySizeException();
                }
            }
        } else {
            throw new MyArraySizeException();
        }

        sum(strings);
    }

    private static void sum(String[][] strings) {
        int count = 0;
        int valueOfCell = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    valueOfCell = Integer.parseInt(strings[i][j]);
                } catch (Exception e){
                    throw new MyArrayDataException("Массив содержит некорректный тип значения в ячейке " + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                }
                count += valueOfCell;
            }
        }
        System.out.println(count);
    }
}