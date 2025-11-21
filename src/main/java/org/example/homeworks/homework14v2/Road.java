package org.example.homeworks.homework14v2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Road extends Stage {
    public int length;
    public String description;

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    @Override
    public void go(Car car) {
        try {
            log.info("{} начал этап: {}", car.getName(), description);
            Thread.sleep(length / car.getSpeed() * 1000);
            log.info("{} закончил этап: {}", car.getName(), description);
        } catch (InterruptedException e) {
            log.error("Произошла ошибка {}", e.getMessage());
        }
    }
}
