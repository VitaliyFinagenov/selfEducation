package org.example.homeworks.homework14v2;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Slf4j
public class CarService {
    private final CyclicBarrier waitForPrepareBarrier;
    private final SignalFinish signalFinish;

    public CarService(int carCount, SignalFinish signalFinish, Runnable afterStartAction) {
        this.waitForPrepareBarrier = new CyclicBarrier(carCount + 1, afterStartAction);
        this.signalFinish = signalFinish;
    }

    public Car createCar(Race race, int speed) {
        return new Car(race, speed, waitForPrepareBarrier, signalFinish);
    }

    public void awaitingAllCarsStarted() {
        try {
            waitForPrepareBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            log.error("Произошла ошибка : {}", e.getMessage());
        }
    }
}
