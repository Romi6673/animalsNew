package com.example.animals;

public class dog extends Animal implements runable{
    @Override
    public void makeSound() {
        System.out.println("the dog barks");
    }
    @Override
    public void move(){
        System.out.println("the dog walk on 4 legs");
    }
    @Override
    public void eat(){
        System.out.println(" dog favourite food is bonzo");
    }

    @Override
    public void run() {
        System.out.println("the dog run");
    }
}
