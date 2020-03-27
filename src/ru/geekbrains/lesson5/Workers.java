package ru.geekbrains.lesson5;

import java.text.MessageFormat;

//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Workers {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    //* Конструктор класса должен заполнять эти поля при создании объекта;
    public Workers(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    //* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public String workersInfo(){
        String pattern = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}";
        return MessageFormat.format(pattern,this.fullName, this.position, this.email, this.phone, this.salary, this.age);

    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

}
