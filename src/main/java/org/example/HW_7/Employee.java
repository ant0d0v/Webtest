package org.example.HW_7;

public class Employee {
    String name;
    int age;
    String gender;
    int salary;

    public Employee(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){

        return name.equals(employee.name);
    }



}
