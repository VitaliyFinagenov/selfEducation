package org.example.homeworks.homework14;

public class Road implements Stage {
//    public Road(int length) {
//        this.length = length;
//        this.description = "Дорога " + length + " метров";
//    }


    public int length;
    public String description;
    public boolean lustStretch;
    public static Object CONSOLE_LOCK;


    public Road(int length, boolean lustStretch, Object CONSOLE_LOCK) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
        this.lustStretch = lustStretch;
        this.CONSOLE_LOCK = CONSOLE_LOCK;
    }

    @Override
    public void go(Car car) {
        try {
            System.out.println(car.getName() + " начал этап: " + description);
            Thread.sleep(length / car.getSpeed() * 1000);
            if (lustStretch) {
                synchronized (CONSOLE_LOCK) {
                    System.out.println(car.getName() + " закончил этап: " + description);
                    int counterValue = car.getAtomicCounter().incrementAndGet();
                    if (counterValue == 1) {
                        System.out.println(car.getName() + " WIN!!!");
                    }
                }
            } else {
                System.out.println(car.getName() + " закончил этап: " + description);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
