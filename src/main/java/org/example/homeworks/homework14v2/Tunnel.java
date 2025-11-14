package org.example.homeworks.homework14v2;

import java.util.concurrent.Semaphore;

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
                System.out.println(car.getName() + " готовится к этапу(ждет): " + description);
                maxCarsLimit.acquire();
                System.out.println(car.getName() + " начал этап: " + description);
                Thread.sleep(length / car.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(car.getName() + " закончил этап: " + description);

                maxCarsLimit.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
