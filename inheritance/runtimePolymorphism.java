package com.inheritance;


class Animal1 {
    void sound1() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound1() {
        System.out.println("The dog barks.");
    }
}

class Cat1 extends Animal1 {
    @Override
    void sound1(){
        System.out.println("The cat meows.");
    }
}

public class runtimePolymorphism {
    public static void main(String[] args) {
       Cat1 x=new Cat1();
       Dog1 y=new Dog1();
       x.sound1();
       y.sound1();
    }
}

