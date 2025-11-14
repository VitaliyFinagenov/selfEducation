package org.example.homeworks.homework14;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static final int CARS_COUNT = 4;
    static CountDownLatch signalStart = new CountDownLatch(CARS_COUNT);
    static CountDownLatch signalFinish = new CountDownLatch(CARS_COUNT);
    private static final AtomicInteger atomicCounter = new AtomicInteger(0);
    private static final Object CONSOLE_LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        Race race = new Race(new Road(60, false, CONSOLE_LOCK), new Tunnel(CONSOLE_LOCK), new Road(40, true, CONSOLE_LOCK));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < CARS_COUNT; i++) {
            cars[i] = new Car(signalStart, signalFinish, atomicCounter, race, 20 + (int) (Math.random() * 10));
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        signalStart.await();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        signalFinish.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка кончилась!!!");
    }
}
