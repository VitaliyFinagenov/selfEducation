package org.example.homeworks.homework8;

import javax.swing.*;

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

//        Human human = new Human("Олег");
//        Cat cat = new Cat("Борис");
//        Robot robot = new Robot("R2 D2");
//        Treadmill treadmill = new Treadmill(100, "run");
//        Wall wall = new Wall(3, "jump");

//        Participant[] participants = {human, cat, robot};
//        Let[] lets = {treadmill, wall};

        var participants = createParticipants();
        var lets = createLets();

        start(participants, lets);
//        newVersion(participants, lets);
//        vitalVersion(participants, lets);
    }

    private static Participant[] createParticipants() {
        Human human = new Human("Олег");
        Cat cat = new Cat("Борис");
        Robot robot = new Robot("R2 D2");
        return new Participant[]{human, cat, robot};
    }

    private static Let[] createLets() {
        Treadmill treadmill = new Treadmill(100, "run");
        Wall wall = new Wall(3, "jump");
        return new Let[]{treadmill, wall};
    }

    private static void start(Participant[] participants, Let[] lets) {
        for (Participant participant : participants) {
            for (Let let : lets) {

                boolean isLetOk = let.getType().equals("run") ?
                        participant.run() >= let.getSize() : participant.jump() >= let.getSize();

                boolean isOk = isGetLet(participant.getName(), let.getSize(), let.getType(), isLetOk);
                if (!isOk) {
                    break;
                }
            }
        }
    }

    private static boolean isGetLet(String participantName, int size, String letType, boolean isLetOk) {
        boolean result = false;
        if (isLetOk && letType.equals("run")) {
            System.out.print(String.format("%s пробежал %dм. Допущен к прыжкам.%n", participantName, size));
            result = true;
        } else if (letType.equals("run")) {
            System.out.println(String.format("%s не пробежал %dм. Не допущен к прыжкам.", participantName, size));
        } else if (isLetOk && letType.equals("jump")) {
            System.out.println(String.format("%s перепрыгнул %dм.", participantName, size));
            result = true;
        } else {
            System.out.println(String.format("%s не перепрыгнул %dм.", participantName, size));
        }
        return result;
    }

private static void vitalVersion(Participant[] participants, Let[] lets) {
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

private static void newVersion(Participant[] participants, Let[] lets) {
    boolean isRun = false;
    for (int i = 0; i < participants.length; i++) {

        for (int j = 0; j < lets.length; j++) {
            if (j == 0) {
                if (participants[i].run() >= lets[j].getSize()) {
                    isRun = true;
                    System.out.println(participants[i].getName() + " пробежал " + lets[j].getSize() + "м. Допущен к прыжкам.");
                } else {
                    System.out.println(participants[i].getName() + " не пробежал " + lets[j].getSize() + "м. Не допущен к прыжкам.");
                }
            } else {
                if (!isRun) {
                    continue;
                }
                if (participants[i].jump() >= lets[j].getSize()) {
                    System.out.println(participants[i].getName() + " перепрыгнул " + lets[j].getSize() + "м.");
                } else {
                    System.out.println(participants[i].getName() + " не перепрыгнул " + lets[j].getSize() + "м.");
                }
            }
        }
    }
}
}

