package org.example.homeworks.homework11;

import java.util.Arrays;

public class Main {
    private static final int SIZE = 10_000_000;
    private static final int HALF = SIZE / 2;
    private static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        firstMethod(initArr(arr));
        secondMethod(initArr(arr));
    }

    private static void firstMethod(float[] arr) {
        long startTime = System.currentTimeMillis();

        calculateArr(arr);

        long finishTime = System.currentTimeMillis();

        System.out.println("время выполнения первого метода " + (finishTime - startTime));
    }

    private static void secondMethod(float[] arr) {
        float[] firstHalfArr = new float[HALF];
        float[] secondHalfArr = new float[HALF];

        System.arraycopy(arr, 0, firstHalfArr, 0, HALF);
        System.arraycopy(arr, HALF, secondHalfArr, 0, HALF);

        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                calculateArr(firstHalfArr);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                calculateArr(secondHalfArr);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        float[] mergedArr = new float[SIZE];
        System.arraycopy(firstHalfArr, 0, mergedArr, 0, HALF);
        System.arraycopy(secondHalfArr, 0, mergedArr, HALF, HALF);

        long stopTime = System.currentTimeMillis();

        System.out.println("время выполнения двух потоков " + (stopTime - startTime));
    }

    private static void calculateArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
    }

    private static float[] initArr(float[] floats) {
        Arrays.fill(floats, 1.0f);
        return floats;
    }
}
