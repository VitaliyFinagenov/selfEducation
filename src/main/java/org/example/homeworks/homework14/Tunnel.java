package org.example.homeworks.homework14;

import java.util.concurrent.Semaphore;

public class Tunnel implements Stage {

    public int length;
    public String description;
    public final Semaphore semaphore = new Semaphore(2, true);
    public static Object CONSOLE_LOCK;

    public Tunnel(Object CONSOLE_LOCK) {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        this.CONSOLE_LOCK = CONSOLE_LOCK;
    }

    @Override
    public void go(Car car) {
        try {
            try {
                System.out.println(car.getName() + " готовится к этапу(ждет): " + description);
                semaphore.acquire();
                System.out.println(car.getName() + " начал этап: " + description);
                Thread.sleep(length / car.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                synchronized (CONSOLE_LOCK) {
                    System.out.println(car.getName() + " закончил этап: " + description);
                }
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
