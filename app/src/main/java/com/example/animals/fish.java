package com.example.animals;

public class fish extends Animal {
    @Override
    public void move(){
        System.out.println("the fish swims");
    }

    @Override
    public void eat(){
        System.out.println(" fish favourite food is vegtables");
    }

    @Override
    public void makeSound() {
        System.out.println("fish sound");
    }


}
