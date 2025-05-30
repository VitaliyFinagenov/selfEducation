package org.example.homeworks.homework9;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер массива не должен превышать 4*4");
    }
}
