package org.example.homeworks.homework4;

public class Employee {
    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст

    private String nameSurname;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String nameSurname, String position, String email, String phoneNumber, int salary, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void printInfo() {
        System.out.println("Employee :\n" +
                "name, surname = " + nameSurname +
                ";\nposition = " + position +
                ";\nemail = " + email +
                ";\nphoneNumber = " + phoneNumber +
                ";\nsalary = " + salary +
                ";\nage = " + age + ";");
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
