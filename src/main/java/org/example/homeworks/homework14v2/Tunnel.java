package org.example.homeworks.homework14v2;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

@Slf4j
public class Tunnel extends Stage {

    public int length;
    public String description;
    public final Semaphore maxCarsLimit;

    public Tunnel(int carsCount) {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        this.maxCarsLimit = new Semaphore(carsCount / 2, true);
    }

    @Override
    public void go(Car car) {
        try {
            try {
                log.info("{} готовится к этапу(ждет): {}", car.getName(), description);
                maxCarsLimit.acquire();
                log.info("{} начал этап: {}", car.getName(), description);
                Thread.sleep(length / car.getSpeed() * 1000L);
            } catch (InterruptedException e) {
                log.error("Произошла ошибка {}", e.getMessage());
            } finally {
                log.info("{} закончил этап: {}", car.getName(), description);
                maxCarsLimit.release();
            }
        } catch (Exception e) {
            log.error("Произошла ошибка {}", e.getMessage());
        }
    }
}
