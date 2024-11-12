package com.example.animals;

public abstract class cat extends Animal implements runable{
    @Override
    public void makeSound() {
        System.out.println("the cat meow");
    }

    @Override
    public void eat(){
        System.out.println(" cat favourite food is milk");
    }

    @Override
    public void run() {
        System.out.println("the cat run");
    }
}
