package org.example.homeworks.homework14v2;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class SignalFinish {
    private final CountDownLatch countDownLatch;

    public SignalFinish(int carsCount) {
        this.countDownLatch = new CountDownLatch(carsCount);
    }

    public void finished() {
        countDownLatch.countDown();
    }

    public void waitWhileAllCarsFinished() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            log.error("Произошла ошибка {}", e.getMessage());
        }
    }
}
