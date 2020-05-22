package com.instanceoff;

public class Main {
    public static void main(String[] args) {
        Person [] person = new Person[200];
        person[0] = new Employee("Tomek", "Sochacki", 1000000);
        person[1] = new Student("Tom", "Soch");

        for (Person b: person){
            if (b instanceof Person){
            b.getDescription();
            System.out.println();
            }else {
                break;
            }
        }
    }
}

abstract class Person{
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract void getDescription();
}

class Employee extends Person{
    double salary;

    Employee(String firstName, String lastName, double salary){
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    void getDescription() {
        System.out.println("I am employee");
        System.out.println("My firstname is: " + firstName);
        System.out.println("My lastname is: " + lastName);
        System.out.println("My salary is: " + salary);
    }
}

class Student extends Person{
    Student(String firstName, String lastName){
        super(firstName, lastName);
    }

    @Override
    void getDescription() {
        System.out.println("I am student");
        System.out.println("My first name is: " + firstName);
        System.out.println("My lastname is: " + lastName);
    }
}