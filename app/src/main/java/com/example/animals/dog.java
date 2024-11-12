package com.example.animals;

public abstract class dog extends Animal implements Runable{
    @Override
    public void makeSound() {
        System.out.println("the dog barks");
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
