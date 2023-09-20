package com.workintech.oop;

import java.util.SplittableRandom;

public class Person {
    String firstName, lastName, mail;
    int age, point, idNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return (age >= 13 && age <= 19);
    }

    public Person() {

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String mail, int point, int idNumber) {
        this.mail = mail;
        this.point = point;
        this.idNumber = idNumber;
    }

    public String toString() {
        return "First Name: " + firstName + " // " +
                "Last Name: " + lastName + " // " +
                "Age: " + age + " // " +
                "ID Number: " + idNumber + " // " +
                "Mail: " + mail + " // " +
                "Exam Point: " + point;
    }


}
