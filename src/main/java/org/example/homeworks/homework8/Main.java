package org.example.homeworks.homework8;

public class Main {
    /*
    1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
классы должны уметь бегать и прыгать (методы возвращают число).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий.
4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
препятствий не идет.
     */

    public static void main(String[] args) {
        Human human = new Human("Олег");
        Cat cat = new Cat("Борис");
        Robot robot = new Robot("R2 D2");
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(3);

        Participant[] participants = {human, cat, robot};
        Let[] lets = {treadmill, wall};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (j == 1) {
                    continue;
                }
                if (participants[i].run() >= lets[j].getSize()) {
                    System.out.println(participants[i].getName() + " пробежал " + lets[j].getSize() + "м. Допущен к прыжкам.");
                    if (participants[i].jump() >= lets[j + 1].getSize()) {
                        System.out.println(participants[i].getName() + " перепрыгнул " + lets[j].getSize() + "м.");
                    } else {
                        System.out.println(participants[i].getName() + " не перепрыгнул " + lets[j].getSize() + "м.");
                    }
                } else {
                    System.out.println(participants[i].getName() + " не пробежал " + lets[j].getSize() + "м. Не допущен к прыжкам.");
                }
            }
        }
    }
}

