package org.example;

import org.example.HW8_1.Manager;
import org.example.HW8_2.Director;

public class Main {
    public static void main(String[] args) {
        //HW_7
//        Задача №1
//
//        Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
//        метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.

//        Person person = new Person("Anton",25,"man");
//        System.out.println(person.getName());

//        Задача №2
//
//        Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//        Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника
//        у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

//        Employee employee = new Employee("Vlad",26,"man",1341);
//        Employee employee1 = new Employee("Vlad",26,"man",1341);
//
//        System.out.println(employee1.isSameName(employee));
//        Задача №3
//
//        Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
//        метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.

//        Salary salary = new Salary();
//
//        System.out.println( salary.getSum(new Employee[]{employee1, employee}));


//        HW8.1
//        Задача №1
//
//        Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//        Все поля сделать приватными и для каждого поля добавить методы set и get.
//        Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.
//
//
//        Задача №2
//
//        Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
//        Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод - getSalary(int days),
//        метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.
//        К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


//        Manager manager = new Manager();
//        manager.setName("Anton");
//        manager.setSalaryDay(100);
//        manager.setNumberOfStaff(5);
//        System.out.println(manager.getSalary(30));

//
//        HW8.2
//        Задача №1
//        Необходимо создать класс Employee со следующими методами:
//        getName - получить имя
//        setName
//        getBaseSalary - базовая ставка
//        setBaseSalary


//        Задача №2
//
//        Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.
//         Необхдимо создать класс Manager в который нужно добавить следующие методы:
//        getNumberOfSubordinates - получить количество подчиненных
//        setNumberOfSubordinates
//        в классе, метод getSalaryManager будет возвращать значение
//        по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
//        Если количество подчиненных 0, то результат как у обычного рабочего.
//        Необходимо создать класс Director, метод getSalaryDirector должен возвращать результат
//        по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
//        Если количество подчиненных 0, то результат как у обычного рабочего.

        Director director = new Director();
        director.setBaseSalary(1000);
        director.setNumberOfSubordinates(0);
        director.setName("Anton");

        System.out.println(director.getSalaryManager());



    }
}




