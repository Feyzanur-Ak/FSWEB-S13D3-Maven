package org.example;

public class Person {

    String firstName;
    String lastName;
    int age;
    String job;
    double salary;
    String city;
    boolean isTeen;

     Person(String firstName,  String lastName, int age, boolean isTeen){
      this.firstName=firstName;
      this.lastName=lastName;
      this.age=age;
      this.isTeen=isTeen;
    }

    Person(String firstName,  String lastName, int age, boolean isTeen, String job,  double salary, String city){
         this(firstName, lastName, age,isTeen);
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
