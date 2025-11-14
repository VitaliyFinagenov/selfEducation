package org.example.homeworks.homework14v2;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private static AtomicBoolean isWinner = new AtomicBoolean(false);
    private CyclicBarrier waitForPrepareBarrier;
    private SignalFinish signalFinish;

    public Car(Race race, int speed, CyclicBarrier waitForPrepareBarrier, SignalFinish signalFinish) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник №" + CARS_COUNT;
        this.waitForPrepareBarrier = waitForPrepareBarrier;
        this.signalFinish = signalFinish;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
        try {
            preparation();
            waitForPrepareBarrier.await();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        startRace();
    }

    private void preparation() throws InterruptedException {
        System.out.println(this.name + " готовится");
        Thread.sleep(500 + (int) (Math.random() * 800));
        System.out.println(this.name + " готов");
    }

    private void startRace() {
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        checkWin();
        signalFinish.finished();
    }

    private void checkWin() {
        if (!isWinner.getAndSet(true)) {
            System.out.println("\nWIN " + this.name + "\n");
        }
    }

}
