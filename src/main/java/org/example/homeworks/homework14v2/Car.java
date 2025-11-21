package org.example.homeworks.homework14v2;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

@Slf4j
@Data
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

    @Override
    public void run() {
        try {
            preparation();
            waitForPrepareBarrier.await();
        } catch (Exception exception) {
            log.error("Произошла ошибка  {}", exception.getMessage());
        }
        startRace();
    }

    private void preparation() throws InterruptedException {
        log.info("{} готовится", this.name);
        Thread.sleep(500 + (int) (Math.random() * 800));
        log.info("{} готов", this.name);
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
            log.warn("WIN {}", this.name);
        }
    }

}
