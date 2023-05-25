package org.example.HW8_1;

public class Manager {
    private String name;
    private int age;
    private String gender;
    private int salaryDay;
    private int numberOfStaff;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(int salaryDay) {
        this.salaryDay = salaryDay;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }
    public double getSalary(int days){
        return getSalaryDay() * days  + getSalaryDay() * (0.01 * getNumberOfStaff());
    }

}
