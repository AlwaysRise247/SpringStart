package org.Spring;


import org.springframework.stereotype.Component;

public class Alien {

    private int age;
    private Laptop laptop1 ; // creating REFERENCE of laptop class


    // Parameterized Constructor


    public Alien(int age, Laptop laptop1) {
        System.out.println("Para Constructor has been Called..");
        this.age = age;
        this.laptop1 = laptop1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter has been called");
        this.age = age;
    }

    public Laptop getLaptop1() {
        return laptop1;
    }

    public void setLaptop1(Laptop laptop1) {
        this.laptop1 = laptop1;
    }

    public void code(){
        System.out.println("Object Created...");
        laptop1.compile();
    }


}
