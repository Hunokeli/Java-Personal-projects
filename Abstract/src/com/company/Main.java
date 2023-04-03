package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("buddy");
        dog.breathe();
        dog.eat();
        Parrot parrot = new Parrot("Tori");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        Penguin penguin = new Penguin("Scamper");
        penguin.fly();
        penguin.eat();
        penguin.breathe();

    }
}
