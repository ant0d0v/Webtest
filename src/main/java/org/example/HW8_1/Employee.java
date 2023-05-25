package org.example.HW8_1;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private int salary;

    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary(int days){
        return salary * days;
    }

}
