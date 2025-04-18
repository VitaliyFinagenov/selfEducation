package org.example.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барбос");
        Cat cat = new Cat("Игорь");
        Animal lizard = new Animal("Виллентретенмерт");
        Animal[] animals = {dog, cat, lizard};

        for (Animal animal : animals) {
            animal.run(50);
            animal.swim(10);
        }

        System.out.println("создано экземпляров родительского класса 'Animal' - " + Animal.getCount());
        Cat.printCount();
        Dog.printCount();
    }
}