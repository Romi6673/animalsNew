package com.example.animals;

public abstract class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("the bird tweets");
    }

    @Override
    public void eat(){
        System.out.println(" bird favourite food is nuts");
    }

    @Override
    public void fly() {
        System.out.println("bird flys");
    }
}
