package org.example.HW8_2;

public class Director extends Manager{
    public int getSalaryDirector(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        }else {
            return (int)(getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }
}
