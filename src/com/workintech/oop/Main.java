package com.workintech.oop;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);
        person.mail = "John@Doe.com";
        person.idNumber = 12123434;
        person.point = 80;

        System.out.println("This is person: " + person);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}