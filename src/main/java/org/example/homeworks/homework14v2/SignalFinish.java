package org.example.homeworks.homework14v2;

import java.util.concurrent.CountDownLatch;

public class SignalFinish {
    private final CountDownLatch countDownLatch;

    public SignalFinish(int carsCount) {
        this.countDownLatch = new CountDownLatch(carsCount);
    }

    public void finished(){
        countDownLatch.countDown();
    }

    public void waitWhileAllCarsFinished() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
