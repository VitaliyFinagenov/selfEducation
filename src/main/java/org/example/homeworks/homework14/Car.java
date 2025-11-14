package org.example.homeworks.homework14;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private final CountDownLatch signalStart;
    private final CountDownLatch signalFinish;
    private final AtomicInteger atomicCounter;
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;

    public Car(CountDownLatch signalStart, CountDownLatch signalFinish, AtomicInteger atomicCounter, Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник №" + CARS_COUNT;
        this.signalStart = signalStart;
        this.signalFinish = signalFinish;
        this.atomicCounter = atomicCounter;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
        preparation();
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        signalFinish.countDown();
    }

    private void preparation() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            signalStart.countDown();
            signalStart.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printWin(AtomicInteger atomicCounter) {
        if (atomicCounter.get() == 1) {
            System.out.println("\nWIN " + this.name + "\n");
        }
    }

    public AtomicInteger getAtomicCounter() {
        return atomicCounter;
    }

    //    private void preparation() {
//        synchronized (lock) {
//            try {
//                System.out.println(this.name + " готовится");
//                readyMadeThread++;
//                Thread.sleep(500 + (int) (Math.random() * 800));
//                System.out.println(this.name + " готов");
//                System.out.println(readyMadeThread);
//                lock.notify();
//                lock.wait();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
