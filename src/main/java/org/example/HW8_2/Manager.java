package org.example.HW8_2;

public class Manager extends Worker{
    private int NumberOfSubordinates;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }
    public int getSalaryManager(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        }else {
            return (int)(getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }
}
