package org.example;

public class Person {

    String firstName;
    String lastName;
    int age;
    String job;
    double salary;
    String city;

     Person(String firstName,  String lastName, int age){
      this.firstName=firstName;
      this.lastName=lastName;
      this.age=age;
    }

    Person(String firstName,  String lastName, int age, String job,  double salary, String city){
         this(firstName, lastName, age);
        this.job=job;
        this.salary=salary;
        this.city=city;
    }

    public String getFirstName(){
         return  firstName;
    }

    public String getLastName(){
        return  lastName;
    }

    public int getAge(){
        return  age;
    }

    public boolean getTeen(){
        return age >= 13 && age <= 19;
    }
}
