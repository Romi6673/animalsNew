package com.example.animals;

public abstract class fish extends Animal {

    @Override
    public void eat(){
        System.out.println(" fish favourite food is vegtables");
    }

    @Override
    public void makeSound() {
        System.out.println("fish sound");
    }


}
