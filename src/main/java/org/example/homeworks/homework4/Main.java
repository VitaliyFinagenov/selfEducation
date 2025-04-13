package org.example.homeworks.homework4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Сергей Маркушов", "Java - разработчик", "batman@mail.ru", "8 916 111 11 11", 200000, 31);
        employeeArray[1] = new Employee("Виталий Финагенов", "бармен", "vitaliy@mail.ru", "8 916 222 22 22", 150000, 30);
        employeeArray[2] = new Employee("Сергей Боков", "личный водитель", "Mr.olimpia@mail.ru", "8 916 333 33 33", 500000, 30);
        employeeArray[3] = new Employee("Ирина Иванова", "врач - эндокринолог", "Doc.Ivanova@mail.ru", "8 916 444 44 44", 150000, 28);
        employeeArray[4] = new Employee("Аккакий Ферапонтов", "охранник", "callMeMisterCool@mail.ru", "8 916 555 55 55", 100000, 60);

        for (Employee employee : employeeArray) {
            if (employee.getAge() >= 40) {
                employee.printInfo();
            }
        }
    }
}
