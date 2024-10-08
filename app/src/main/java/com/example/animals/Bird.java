package com.example.animals;

public class Bird extends Animal implements flyable{
    @Override
    public void makeSound() {
        System.out.println("the bird tweets");
    }
    @Override
    public void move(){
        System.out.println("the bird fly");
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
