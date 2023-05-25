package org.example.HW_7;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        if(gender.equals("man")){
            return  "Mr. " + name;
        } else if (gender.equals("girl")) {
            return "Mrs. " + name;
        }
        return name;
    }

}
